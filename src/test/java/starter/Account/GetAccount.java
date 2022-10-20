package starter.Account;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class GetAccount {

    private String url, token;

    public void setUrlAndValidUsernameAndPassword(){
        url = "https://demoqa.com/Account/v1/GenerateToken";
    }

    public void setUrlAndInvalidUsernameAndPassword(){
        url = "https://demoqa.com/Account/v1/GenerateToken";
    }

    public void setUrlAndValidUsernameAndInvassword(){
        url = "https://demoqa.com/Account/v1/GenerateToken";
    }

    public void setUrlAndInvalidUsernameAndInvalidpassword(){
        url = "https://demoqa.com/Account/v1/GenerateToken";
    }

    public JSONObject bodyCreateAccount(){
        JSONObject body = new JSONObject();
        body.put("userName", "admin");
        body.put("password","admin");
        return body;
    }

    public void validUserameAndPassword(){
        given().header("accept","application/json")
                .header("authorizatoin","Basic YWRtaW46YWRtaW4=")
                .header("content-Type","apllication/json")
                .body(bodyCreateAccount().toJSONString());
        when().post(url);
    }

    public JSONObject bodyInvalidUsername(){
        JSONObject body = new JSONObject();
        body.put("userName", "");
        body.put("password","admin");
        return body;
    }

    public void invalidUsername(){
        given().header("accept","application/json")
                .header("authorizatoin","Basic YWRtaW46YWRtaW4=")
                .header("content-Type","apllication/json")
                .body(bodyInvalidUsername().toJSONString());
        when().post(url);
    }

    public JSONObject bodyInvalidPassword(){
        JSONObject body = new JSONObject();
        body.put("userName", "admin");
        body.put("password","");
        return body;
    }

    public void invalidPassword(){
        given().header("accept","application/json")
                .header("authorizatoin","Basic YWRtaW46YWRtaW4=")
                .header("content-Type","apllication/json")
                .body(bodyInvalidPassword().toJSONString());
        when().post(url);
    }

    public JSONObject bodyInvalidUsernameAndPassword(){
        JSONObject body = new JSONObject();
        body.put("userName", "");
        body.put("password","");
        return body;
    }

    public void invalidUsernameAndPassword(){
        given().header("accept","application/json")
                .header("authorizatoin","Basic YWRtaW46YWRtaW4=")
                .header("content-Type","apllication/json")
                .body(bodyInvalidUsernameAndPassword().toJSONString());
        when().post(url);
    }


    public void validateStatusCode(){
        then().statusCode(400);
    }

    public void validateStatus200(){
        then().statusCode(200);
    }

    public void validateForbiddenMessage(){
        then().body(equalTo("Forbidden"));
    }

    public void validateAccount(){
        then().body(equalTo("String"));
    }

}
