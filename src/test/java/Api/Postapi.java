package Api;

import static org.junit.Assert.assertArrayEquals;
import static org.testng.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Postapi {

	@Test
	public void Post() {

		RequestSpecification request=RestAssured.given();

		request.header("Content-Type", "application/json");

		JSONObject json = new JSONObject();
		json.put("id", "100");
		json.put("title", "Rest assured");
		json.put("author", "Jagu Sekhar");

		request.body(json.toJSONString());

		Response response=request.post("http://localhost:3000/posts/");

		int code = response.getStatusCode();

System.out.println("Status Code ="+ code);


		Assert.assertEquals(code, 201);


	}
}
