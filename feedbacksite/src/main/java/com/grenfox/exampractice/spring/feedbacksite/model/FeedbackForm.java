package com.grenfox.exampractice.spring.feedbacksite.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.NotBlank;

@Entity
public class FeedbackForm {

  private static final String REGEXP_CONTAINS_DOT_AND_AT_SIGN = "^(?=.*?\\.)(?=.*?@).*$";

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @NotBlank(message = "must not be blank")
  private String feedbackText;

  @Min(value = 10, message = "must be 10 or greater ;)")
  private int recommendationRating;

  @Pattern(regexp = REGEXP_CONTAINS_DOT_AND_AT_SIGN,
          message = "must contain a @ and a dot (\".\")")
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
