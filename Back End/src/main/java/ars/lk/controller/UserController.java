package ars.lk.controller;

import ars.lk.dto.UserDTO;
import ars.lk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/ars")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value="/login",consumes= MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean loginVerification(@RequestBody UserDTO user){
       return userService.loginVerification(user);
    }

    @PostMapping(value="/signup",consumes= MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean signup(@RequestBody UserDTO user){
        return userService.saveUser(user);
    }

}
