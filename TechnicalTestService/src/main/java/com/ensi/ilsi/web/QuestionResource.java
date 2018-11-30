
package com.ensi.ilsi.web;


import com.ensi.ilsi.domain.Question;
import com.ensi.ilsi.service.QuestionService;
import org.springframework.web.bind.annotation.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hajer
 */
@RestController
@RequestMapping("/questions")
public class QuestionResource {
   

    private final QuestionService questionService;

    public QuestionResource(QuestionService questionService) {
        this.questionService = questionService;
    }


    @GetMapping("/{id}")
    public Question findById(@PathVariable int id) {
        return this.questionService.findById(id);
    }

    @PostMapping
    public Question create(Question q) {
        return this.questionService.create(q);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        this.questionService.deleteById(id);
    }

    
}
    