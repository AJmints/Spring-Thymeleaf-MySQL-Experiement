package org.experiment.solidifyconcepts.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    /** Login Page doesn't work yet. Need to learn to keep user logged in. **/
    @GetMapping
    public String login() {
        return "user/login";
    }

}
