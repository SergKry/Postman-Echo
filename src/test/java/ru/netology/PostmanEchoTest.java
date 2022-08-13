package ru.netology;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
public class PostmanEchoTest {

    @Test
    void shouldPostLife() {
        given()
                .baseUri("https://postman-echo.com")
                .body("life: infinite")
                .when()
                .post("/post")
                .then()
                .statusCode(300)
                .body("data", equalTo("life: infinite"))
        ;
    }
}
