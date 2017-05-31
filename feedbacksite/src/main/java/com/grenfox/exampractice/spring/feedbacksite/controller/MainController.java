package com.grenfox.exampractice.spring.feedbacksite.controller;

import com.grenfox.exampractice.spring.feedbacksite.model.RatingForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @GetMapping("/")
  public String showWelcomePage(Model model, RatingForm ratingForm) {
    model.addAttribute("ratingForm", ratingForm);
    return "index";
  }
}
