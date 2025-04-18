package Api;

import static org.testng.Assert.assertEquals;

import java.security.PublicKey;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Getapi 
{
	@Test
	public void responsecode()
	{

		Response res =	RestAssured.get("https://catfact.ninja/fact");

		String Body = res.asString();

		System.out.println("Body response="+ Body);

	}
@Test
	public void code() {
		
	Response res =	RestAssured.get("https://catfact.ninja/fact");
	int code = res.getStatusCode();
	System.out.println("Status code ="+ code );
	assertEquals(code, 200);
	
	System.out.println("Performance=" + res.getTime() );
	
	
	
	
		
		
		
	}
	
	}




