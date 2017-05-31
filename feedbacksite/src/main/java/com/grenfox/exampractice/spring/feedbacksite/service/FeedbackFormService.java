package com.grenfox.exampractice.spring.feedbacksite.service;

import com.grenfox.exampractice.spring.feedbacksite.model.FeedbackForm;
import com.grenfox.exampractice.spring.feedbacksite.repository.FeedbackFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackFormService {

  private final FeedbackFormRepository feedbackFormRepository;

  @Autowired
  public FeedbackFormService(FeedbackFormRepository feedbackFormRepository) {
    this.feedbackFormRepository = feedbackFormRepository;
  }

  public void save(FeedbackForm feedbackForm) {
    feedbackFormRepository.save(feedbackForm);
  }
}
