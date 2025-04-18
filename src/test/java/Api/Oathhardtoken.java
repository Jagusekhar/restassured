package Api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Oathhardtoken {
	
	@Test
	public void hardtoken() {
		
	Response res=	RestAssured.given()
		.auth()
		.oauth2("195b1357d094402787cda1d1b5e851ed0871c284")
		.post("http://coop.apps.symfonycasts.com/api/5136/eggs-collect");
		
	System.out.println(res.getStatusCode());
	
	System.out.println(res.getBody().asString());
	}

}
