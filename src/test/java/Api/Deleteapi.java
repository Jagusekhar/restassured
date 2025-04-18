package Api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Deleteapi {

	@Test
	public void Delete() {

		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");

		Response response = request.delete("http://localhost:3000/posts/100");

		int code=response.getStatusCode();

		System.out.println(code);





	}

}
