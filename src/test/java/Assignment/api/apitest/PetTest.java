package Assignment.api.apitest;

import Assignment.api.models.Category;
import Assignment.api.models.CreatePet;
import Assignment.api.models.GoRestService;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PetTest {

    static int id;

    @Test
    @Order(1)
    public void Pets_CreatePet_Success() {

        Category category=new Category();
        category.setId(10);
        category.setName("Birds");

        CreatePet createPetModel = new CreatePet();
        createPetModel.setId(4227);
        createPetModel.setName("Sparrow Hawk");
        createPetModel.setStatus("Available");
        createPetModel.setPhotoUrls(new ArrayList<>(Arrays.asList("https://www.pinterest.com/pin/491947959277019677/","https://www.wildlifetrusts.org/wildlife-explorer/birds/birds-prey/sparrowhawk")));
        createPetModel.setCategory(category);

        id = GoRestService.createPet(createPetModel)
                .then()
                .statusCode(200)
                .body("id", equalTo(createPetModel.getId()))
                .body("name", equalTo(createPetModel.getName()))
                .extract().jsonPath().getInt("id");
    }


    @Test
    @Order(2)
    public void Pets_GetPet_Success(){

        GoRestService.getPet(id)
                .then()
                .statusCode(200)
                .body("id",equalTo(id));

    }
    @Test
    @Order(3)
    public void Pets_UpdatePet_Success(){

        Category category=new Category();
        category.setId(10);
        category.setName("Birds");

        CreatePet updatePetModel = new CreatePet();
        updatePetModel.setId(1);
        updatePetModel.setName("Eagle");
        updatePetModel.setStatus("Available");
        updatePetModel.setPhotoUrls(new ArrayList<>(Arrays.asList("https://www.britannica.com/animal/bald-eagle","https://www.birdlife.org/birds/eagle/")));
        updatePetModel.setCategory(category);


        GoRestService.updatePet(updatePetModel)
                .then()
                .statusCode(200)
                .body("id",equalTo(updatePetModel.getId()))
                .body("name",equalTo(updatePetModel.getName()));

    }

    @Test
    @Order(4)
    public void Pets_DeletePet_Success(){

        GoRestService.deletePet(id)
                .then()
                .statusCode(200)
                .body("message",equalTo(String.valueOf(id)));

    }
}


