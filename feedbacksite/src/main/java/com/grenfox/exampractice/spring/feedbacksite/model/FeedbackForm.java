package com.grenfox.exampractice.spring.feedbacksite.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FeedbackForm {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String feedbackText;
  private int recommendationRating;
  private String email;

  public FeedbackForm() {
  }

  public FeedbackForm(String feedbackText, int recommendationRating, String email) {
    this.feedbackText = feedbackText;
    this.recommendationRating = recommendationRating;
    this.email = email;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getFeedbackText() {
    return feedbackText;
  }

  public void setFeedbackText(String feedbackText) {
    this.feedbackText = feedbackText;
  }

  public int getRecommendationRating() {
    return recommendationRating;
  }

  public void setRecommendationRating(int recommendationRating) {
    this.recommendationRating = recommendationRating;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
