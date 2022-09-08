package Assignment.api.models;

import Assignment.api.services.BaseService;
import io.restassured.response.Response;

public class GoRestService extends BaseService {

    public static Response createPet(CreatePet createPet) {
        return defaultRequestSpecification()
                .body(createPet)
                .when()
                .post("/pet");
    }

    public static Response getPet(int id) {
        return defaultRequestSpecification()
                .pathParam("id", id)
                .when()
                .get("/pet/{id}");
    }

    public static Response updatePet(CreatePet updatePetModel) {
        return defaultRequestSpecification()
                .body(updatePetModel)
                .when()
                .put("/pet");

    }

    public static Response deletePet(int id) {
        return defaultRequestSpecification()
                .pathParam("id", id)
                .when()
                .delete("/pet/{id}");
    }
}
