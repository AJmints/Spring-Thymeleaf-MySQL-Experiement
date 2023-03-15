package org.experiment.solidifyconcepts.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    /** Not really used yet. Pending... **/
    @GetMapping
    public String index() {
        return "feed/feed";
    }

    @GetMapping("/art")
    public String viewArt() {
        return "/artwork/art-home";
    }


}
