package com.grenfox.exampractice.spring.feedbacksite.controller;

import com.grenfox.exampractice.spring.feedbacksite.model.FeedbackForm;
import com.grenfox.exampractice.spring.feedbacksite.service.FeedbackFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  private final FeedbackFormService feedbackFormService;

  @Autowired
  public MainController(FeedbackFormService feedbackFormService) {
    this.feedbackFormService = feedbackFormService;
  }

  @GetMapping("/")
  public String showWelcomePage(Model model, FeedbackForm feedbackForm) {
    model.addAttribute("feedbackForm", feedbackForm);
    return "index";
  }

  @PostMapping("/form-welcome-feedback")
  public String receiveWelcomeForm(FeedbackForm feedbackForm) {
    feedbackFormService.save(feedbackForm);
    return "redirect:/";
  }
}
