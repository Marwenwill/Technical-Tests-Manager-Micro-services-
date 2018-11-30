/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.service;


import com.ensi.ilsi.domain.Question;
import com.ensi.ilsi.repository.QuestionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 *
 * @author hajer
 */
@Service
public class QuestionService {
    private final Logger log = LoggerFactory.getLogger(QuestionService.class);

    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }
    


    public Question create(Question q) {
        log.debug("Request to create Question : {}", q);
        return this.questionRepository.save(
                new Question(
                    q.getQuestion(),
                    q.getDescription()
                ));
    }

        public Question findById(int QuestionId) {
            log.debug("Request to get Question : {}", QuestionId);
            return this.questionRepository.findById(QuestionId);
    }
    
        public void deleteById(int QuestionId) {
            log.debug("Request to delete Question : {}", QuestionId );
            this.questionRepository.deleteById(QuestionId);
    }
    
     
}