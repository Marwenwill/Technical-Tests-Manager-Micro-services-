/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 *
 * @author hajer
 */
@Entity
@Table(name = "question")
public class Question {
 
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int questionId;

    @NotNull
    @Column(name = "question")
    private String question; 

    @NotNull
    @Column(name = "description")
    private String description;

    @NotNull
    @ManyToOne
    private TechnicalTest technicalTest;

    public int getQuestionId() {

        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Question() {
    }

    public Question(String question, String description) {
        this.question = question;
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + this.questionId;
        hash = 61 * hash + Objects.hashCode(this.question);
        hash = 61 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Question other = (Question) obj;
        if (this.questionId != other.questionId) {
            return false;
        }
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Question{" + "questionId=" + questionId + ", question=" + question + ", description=" + description + '}';
    }
 
}