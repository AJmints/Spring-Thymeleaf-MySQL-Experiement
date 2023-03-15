package org.experiment.solidifyconcepts.controllers;

import jakarta.validation.Valid;
import org.experiment.solidifyconcepts.data.UserRepository;
import org.experiment.solidifyconcepts.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("create")
public class CreateAccountController {

    /** This controller works as it should when you create an account, similar format to FeedController **/

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String createAccount(Model model) {
        model.addAttribute("title", "Create Account");
        model.addAttribute(new User());
        return "user/create-account";
    }

    @PostMapping(value="process")
    public String processAddUserForm(@ModelAttribute @Valid User newUser,
                                     Errors errors, Model model, String verify) {

        if (errors.hasErrors()) {
            System.out.println("In errors");
            return "user/create-account";
        }

        if (newUser.getPassword().equals(verify)) {
            userRepository.save(newUser);
            return "redirect:/profile";
        } else {
            model.addAttribute("errorMsg", "Passwords did not match.");
            return "user/create-account";
        }
    }

}
