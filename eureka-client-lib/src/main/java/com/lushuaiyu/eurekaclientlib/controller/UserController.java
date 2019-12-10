package com.lushuaiyu.eurekaclientlib.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lushuaiyu
 */
@RestController
public class UserController {

    //@RequestMapping(value = "findByName")
    //public User findByName() {
    //    User user = new User();
    //    user.setAge("4");
    //    user.setLevel("2");
    //    user.setName("asdf");
    //    return user;
    //}


    @GetMapping(value = "/index")
    public String index() {
        return "this is user lb index";
    }
}
