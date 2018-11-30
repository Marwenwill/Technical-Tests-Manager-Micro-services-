/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Set;


/**
 *
 * @author hajer
 */
@Entity
@Table(name = "technicalTest")
public class TechnicalTest {

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "id", nullable = false)
    private int technicalTestId;
    
    @NotNull
    @Column(name = "description", nullable = false)
    private String technicalTestDescription;
    
    @NotNull
    @Column(name = "type", nullable = false)
    private TestType technicalTestType;
    
    
    @NotNull
    @OneToMany(mappedBy = "technicalTest")
    private Set<Question> questions;
    

    public int getTechnicalTestId() {
        return technicalTestId;
    }

    public void setTechnicalTestId(int technicalTestId) {
        this.technicalTestId = technicalTestId;
    }

    public String getTechnicalTestDescription() {
        return technicalTestDescription;
    }

    public void setTechnicalTestDescription(String technicalTestDescription) {
        this.technicalTestDescription = technicalTestDescription;
    }

    public TestType getTechnicalTestType() {
        return technicalTestType;
    }

    public void setTechnicalTestType(TestType technicalTestType) {
        this.technicalTestType = technicalTestType;
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }
    
    
    public TechnicalTest() {
    }


    public TechnicalTest(String technicalTestDescription, TestType technicalTestType, Set<Question> questions) {
        this.technicalTestDescription = technicalTestDescription;
        this.technicalTestType = technicalTestType;
        this.questions = questions;
    }
    
    public enum TestType {
    Python, Java, C, SQL
}
    
    @Override
    public String toString() {
        return "Technical Test{" +
                "Type='" + technicalTestType + '\'' +
                ", description='" + technicalTestDescription + '\'' +
                ", Questions =" + questions +
                '}';
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(technicalTestType, technicalTestDescription,questions ); 
    }
}



