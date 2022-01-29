import io.restassured.response.Response;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Get_City_Temp extends Config {
    public String Temp ;

    String URl = "http://api.weatherstack.com/current?access_key="+APIKey+"&query="+City+"";
@Test
       public void GetTemp(){
        Response response=  given()
                 .when()
                 .get(URl)
                 .then().log().all().assertThat().statusCode(200).extract().response()
                   ;
       Temp =  response.jsonPath().getString("current.temperature");
         System.out.print(Temp);

}

}
