package Day1;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;  
import static org.hamcrest.Matchers.*;

import java.util.HashMap;        

public class Test1 {


    @Test
     void FirstTest() {

        Response res = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println("StatusBody:"+ res.getBody().asString());
        System.out.println("Statuscode:"+res.getStatusCode());
        System.out.println("StatusTime:"+ res.getTime());
        
        //Validation of status code
        
        int ExpectedStatusCode = 200;
        int ActualStatusCode = res.getStatusCode();
        
        Assert.assertEquals(ExpectedStatusCode , ActualStatusCode);
        
        		

    }
}
    