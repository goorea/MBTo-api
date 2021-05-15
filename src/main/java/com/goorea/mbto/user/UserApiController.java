package com.goorea.mbto.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiController {

    @RequestMapping(value = "/users/api/test/", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String getUsersApiTest() {
        return "{\"result\": \"ok\"}";
    }
}
