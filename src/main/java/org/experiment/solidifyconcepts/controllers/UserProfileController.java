package org.experiment.solidifyconcepts.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("profile")
public class UserProfileController {

    /** Need to learn how to keep user logged in, so they can modify their page. **/

    @GetMapping
    public String viewFeed() {
        return "/user/user-account";
    }

}
