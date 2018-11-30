/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.TechnicalTesting.Domain;

import com.ensi.ilsi.TechnicalTesting.Domain.Candidate;
import java.util.Objects;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author Toshiba-PC
 */
@Entity
@Table(name = "manager")
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idManger;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;


    @Column(name = "telephone")
    private String telephone;

    @OneToMany
    private Set<Candidate> candidatesList;

    @OneToMany
    private Set<TechnicalTest> TestList;

    public Manager() {
        // JPA
    }

    public Manager(String firstName, String lastName, String telephone, Set<Candidate> candidatesList, Set<TechnicalTest> TestList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephone = telephone;
        this.candidatesList = candidatesList;
        this.TestList = TestList;
    }

    public int getIdManger() {
        return idManger;
    }

    public void setIdManger(int idManger) {
        this.idManger = idManger;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Set<Candidate> getCandidatesList() {
        return candidatesList;
    }

    public void setCandidatesList(Set<Candidate> candidatesList) {
        this.candidatesList = candidatesList;
    }

    public Set<TechnicalTest> getTestList() {
        return TestList;
    }

    public void setTestList(Set<TechnicalTest> TestList) {
        this.TestList = TestList;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Manager other = (Manager) obj;
        if (this.idManger != other.idManger) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.telephone, other.telephone)) {
            return false;
        }
        if (!Objects.equals(this.candidatesList, other.candidatesList)) {
            return false;
        }
        if (!Objects.equals(this.TestList, other.TestList)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Manager{" + "idManger=" + idManger + ", firstName=" + firstName + ", lastName=" + lastName + ", telephone=" + telephone + ", candidatesList=" + candidatesList + ", TestList=" + TestList + '}';
    }




}
