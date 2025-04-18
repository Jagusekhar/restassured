package Api;

import org.testng.annotations.Test;

import bsh.Primitive;
import io.restassured.RestAssured;

public class Authentication {
	
	@Test
 public void Auth() {
	 
	int code =RestAssured.given().auth().preemptive().basic("postman", "password").when().get("https://toolsqa.com/rest-assured/basic-auth/").getStatusCode();
	System.out.println(code);
	}
  

}
