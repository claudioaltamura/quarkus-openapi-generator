package de.claudioaltamura.quarkus.openapi.generator;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasItem;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class PetsRessourceIT {

	@Test
	public void testHelloEndpoint() {
		given()
				.when().get("/pets")
				.then()
				.statusCode(200)
				.body("size()", is(1))
				.body("name", hasItem("Flush"))
				.body("tag", hasItem("Flush"));
	}
}