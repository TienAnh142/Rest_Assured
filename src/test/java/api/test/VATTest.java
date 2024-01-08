package api.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import api.endpoints.VATEndPoints;
import api.testdata.VATDataMapper;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class VATTest {
	VATDataMapper vatData;
	Response response;
	JsonPath jsonPathEvaluator;
	private String bearerToken;

	@BeforeClass
	public void setupData() {
		vatData = VATDataMapper.getVATData();

	}

	@Test
	public void getBearerToken() {
		response = VATEndPoints.getBasicAuth(vatData.getUserName(), vatData.getPassword());
		response.then().log().all();

		Assert.assertEquals(response.getStatusCode(), 200);
		jsonPathEvaluator = response.jsonPath();

		bearerToken = jsonPathEvaluator.get("data.accessToken");
	}

	// @Test(priority = 1)
	public void postUser() {
		Response response = VATEndPoints.createVATRequest(vatData);
		response.then().log().all();

		Assert.assertEquals(response.getStatusCode(), 200);
	}

	//@Test
	public void getUserByName() {
		Response response = VATEndPoints.getAllVAT(bearerToken);
		response.then().log().all();

		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Test
	public void getVATByID() {
		Response response = VATEndPoints.getVATByID(bearerToken);
		response.then().log().all();

		Assert.assertEquals(response.getStatusCode(), 200);
	}
}
