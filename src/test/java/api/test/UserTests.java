package api.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;

import api.endpoints.VATEndPoints;
import io.restassured.response.Response;

public class UserTests {

	Faker faker;
	//User userPayload;

	@BeforeClass
	public void setupData() {
		faker = new Faker();
//		userPayload = new User();
//
//		userPayload.setId(faker.idNumber().hashCode());
//		userPayload.setUserName(faker.name().username());
//		userPayload.setFirstName(faker.name().firstName());
//		userPayload.setLastName(faker.name().lastName());
//		userPayload.setEmail(faker.internet().safeEmailAddress());
//		userPayload.setPassword(faker.internet().password(5, 10));
//		userPayload.setPhone(faker.phoneNumber().cellPhone());
	}

	@Test(priority = 1)
	public void postUser() {
		//Response response = VATEndPoints.createVATRequest(userPayload);
		//response.then().log().all();

		//Assert.assertEquals(response.getStatusCode(), 200);
	}

	@Test(priority = 2)
	public void getUserByName() {
		//Response response = VATEndPoints.getVATByID(this.userPayload.getUserName());
		//response.then().log().all();

		//Assert.assertEquals(response.getStatusCode(), 200);
	}
}
