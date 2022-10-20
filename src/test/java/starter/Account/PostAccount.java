package starter.Account;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class PostAccount {

    private String url, token;

    public void setUrlAndValidUsernameAndPassword(){
        url = "https://demoqa.com/Account/v1/GenerateToken";
        token = "Bearer QAZ";
    }

    public JSONObject bodyCreateAccount(){
        JSONObject body = new JSONObject();
        body.put("name", "coba");
        return body;
    }

    public void requestUsername(){
        given().header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json")
                .body(bodyCreateAccount().toJSONString());
        when().post(url);
    }

    public void verifyDetailResponse(){
        then().body("name", equalTo("coba"));
    }
}
