package com.grenfox.exampractice.spring.feedbacksite.repository;

import com.grenfox.exampractice.spring.feedbacksite.model.FeedbackForm;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackFormRepository extends CrudRepository<FeedbackForm, Long> {

}
