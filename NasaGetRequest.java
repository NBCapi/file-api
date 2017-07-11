package APITesting.com.org.api1;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
public class NasaGetRequest {
	
	//Simple Get Request for getting sound request by string 'apollo' and api_key
	// Response Code:200
	
	@Test
	public void Test_01(){
		
		Response resp=when().get("https://api.nasa.gov/planetary/sounds?q=apollo&api_key=aiCCt9RkNgb2ReMQNv6AMWG9ZU2O5wKKPCGcjT0q");
		System.out.println(resp.getStatusCode());
		Assert.assertEquals(resp.getStatusCode(), 200);
	}
	
	


	private RestAssured when() {
		// TODO Auto-generated method stub
		return null;
	}




	// Response Code:403
	
	@Test
	public void Test_02(){
		
		Response resp=when().
		get("https://api.nasa.gov/planetary/sounds?q=apollo&api_key=aiCCt9RkNgb2ReMQNv6AMWG9ZU2O5wKKPCGcjT0");
		System.out.println(resp.getStatusCode());
		Assert.assertEquals(resp.getStatusCode(), 403);
	}
	

}
