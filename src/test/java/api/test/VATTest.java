package api.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import api.endpoints.VATEndPoints;
import api.testdata.VATDataMapper;
import io.restassured.response.Response;

public class VATTest {
	VATDataMapper vatData;

	@BeforeClass
	public void setupData() {
		vatData = VATDataMapper.getVATData();
		JsonObject requestParam = new JsonObject();

	}

	//@Test
	public void getBearerToken() {
//		Response response = VATEndPoints.getBasicAuth();
//		response.then().log().all();
//
//		Assert.assertEquals(response.getStatusCode(), 200);
//		String bearerToken=response.body().
	}

	// @Test(priority = 1)
	public void postUser() {
		Response response = VATEndPoints.createVATRequest(vatData);
		response.then().log().all();

		Assert.assertEquals(response.getStatusCode(), 200);
	}

	@Test
	public void getUserByName() {
		Response response = VATEndPoints.getAllVAT(vatData.getBearerToken());
		response.then().log().all();

		Assert.assertEquals(response.getStatusCode(), 200);
	}
}
