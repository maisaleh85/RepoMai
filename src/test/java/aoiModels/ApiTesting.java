package aoiModels;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ApiTesting {
    @Test
    public void createResource(){
     given().baseUri("https://679ce15287618946e653bb09.mockapi.io/Api/v1").
             when().get("Users") .
             then().log().all().assertThat().statusCode(200);
    }
}
