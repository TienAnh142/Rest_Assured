package api.endpoints;

import static io.restassured.RestAssured.given;

import api.testdata.VATDataMapper;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class VATEndPoints {
	public static Response createVATRequest(VATDataMapper payload) {
		Response response = given().contentType(ContentType.JSON).accept(ContentType.JSON).body(payload).when()
				.post(Routes.post_url);
		return response;
	}

	public static Response getAllVAT(String token) {
		Response response = given()
				.config(RestAssuredConfig.newConfig().sslConfig(new SSLConfig().relaxedHTTPSValidation()))
				.header("Authorization", "Bearer " + token).when().get(Routes.get_url);
		return response;
	}

	public static Response getBasicAuth(String userName, String password) {
		Response response = given()
				.config(RestAssuredConfig.newConfig().sslConfig(new SSLConfig().relaxedHTTPSValidation()))
				.contentType(ContentType.JSON).accept(ContentType.JSON).body(userName).when().get(Routes.get_url);
		return response;
	}
}
