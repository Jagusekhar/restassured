package Api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Oathtokengeneration {
	@Test
	public void tokengen() {

		Response res=  RestAssured.given()
				.formParam("client id", "Jagu Sekhar")
				.formParam("client secret", "dc8efc46ab7f17d7f395f4719910c657")
				.formParam("grant_type", "client_credentials")
				.post("http://coop.apps.symfonycasts.com/token");

		String token = res.jsonPath().get("access_token");	

		System.out.println(token);


		Response res1 = RestAssured.given()
				.auth()
				.oauth2(token)
				.post("http://coop.apps.symfonycasts.com/api/5136/eggs-collect");
		
		System.out.println(res1.getBody().asString());
		
		System.out.println(res1.getStatusCode());
		









	}

}
