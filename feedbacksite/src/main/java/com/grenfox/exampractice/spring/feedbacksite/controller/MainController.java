package com.grenfox.exampractice.spring.feedbacksite.controller;

import com.grenfox.exampractice.spring.feedbacksite.model.FeedbackForm;
import com.grenfox.exampractice.spring.feedbacksite.service.FeedbackFormService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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

  @PostMapping("/")
  public String receiveWelcomeForm(@Valid FeedbackForm feedbackForm, BindingResult bindingResult) {

    if (bindingResult.hasErrors()) {
      return "index";
    }

    feedbackFormService.save(feedbackForm);
    return "redirect:/thankyou";
  }

  @GetMapping("/thankyou")
  public String showProjects() {
    return "thankyou";
  }
}
