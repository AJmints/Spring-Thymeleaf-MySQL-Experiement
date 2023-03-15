package org.experiment.solidifyconcepts.controllers;

import org.experiment.solidifyconcepts.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("search")
public class SearchController {

    /** Search Page doesn't work yet. Pending... **/

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/search")
    public String searchAccounts() {
        return "search/search-main";
    }

    @GetMapping
    public String displayUsers(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "search/search-main";
    }

}
