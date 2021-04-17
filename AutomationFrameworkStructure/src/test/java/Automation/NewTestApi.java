package Automation;

import static io.restassured.RestAssured.*;

import java.awt.image.RescaleOp;
import java.io.File;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class NewTestApi {
 // @Test
 /* @Parameters({"URI"})
  public void f(String URI) {
	  
	  //https://reqres.in/api/users?page=2
	  Response status= get(URI);
	  status.prettyPrint();
	  System.out.println(status.getStatusCode());
	  System.out.println(status.getTime());
  }*/
  @Test
  public void PostOfMethod() {
	  /*Add the url
	   * Add the content type Json
	   * Body
	   * Response
	   * 
	   */
	  File fi=new File("C:\\Users\\user\\AutomationWinterCoding\\AutomationFrameworkStructure\\Create.json");
	 Response ti= given().contentType(ContentType.JSON).body(fi).post("https://reqres.in/api/users");
	 ti.prettyPrint();
	 System.out.println(ti.getStatusCode());
	 System.out.println(ti.getTime());
  }
}
