package Assignment.api.services;

import Assignment.utilities.ConfigurationReader;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class BaseService {
    protected static RequestSpecification defaultRequestSpecification() {
        RestAssured.baseURI = ConfigurationReader.get("swaggerUrl");
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.urlEncodingEnabled = false;
        return given()
                .header("Content-type", "application/json");
    }
}
