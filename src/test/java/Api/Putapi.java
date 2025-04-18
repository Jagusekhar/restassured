package Api;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Putapi {
	@Test
	public void put() {
		
		//Jagu Sekhar code
		RequestSpecification request= RestAssured.given();
		
		request.header("Content-type","application/json");
		
		JSONObject json = new JSONObject();
		
		json.put("author", "Jagu Sekhar");
		json.put("id", "100");
		json.put("title", "API Testing");
		
		request.body(json.toJSONString());
		
		Response response = request.put("http://localhost:3000/posts/100");
		
		int code = response.getStatusCode();
		
		System.out.println(code);
	}

}
