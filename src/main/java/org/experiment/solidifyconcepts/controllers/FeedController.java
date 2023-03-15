package org.experiment.solidifyconcepts.controllers;

import jakarta.validation.Valid;
import org.experiment.solidifyconcepts.data.PostRepository;
import org.experiment.solidifyconcepts.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("feed")
public class FeedController {

    /** This class manages the behaviors of feed.html located in resources/templates/feed **/
    @Autowired
    private PostRepository postRepository;

    @GetMapping
    public String displayPost(Model model) {
        model.addAttribute("allPost", postRepository.findAll());
        model.addAttribute(new Post());
        return "feed/feed";
    }

    @PostMapping("submit")
    public String submitPost(Model model, @ModelAttribute @Valid Post newPost,
                             Errors errors) {
        if (errors.hasErrors()) {
            return "feed/feed";
        }

        model.addAttribute("allPost", postRepository.findAll());
        postRepository.save(newPost);
        return "redirect:/feed";
    }

}