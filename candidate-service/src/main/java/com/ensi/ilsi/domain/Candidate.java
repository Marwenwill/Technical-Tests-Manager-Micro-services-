/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.TechnicalTesting.Domain;

import java.util.Objects;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ASUS-PC
 */
@Entity
@Table(name = "candidate")
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCandidate;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "telephone")
    private String telephone;

    @OneToMany
    private Set<TechnicalTest> testList;

    public Candidate() {
        // JPA
    }

    public Candidate(String firstName, String lastName, String telephone, Set<TechnicalTest> testList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephone = telephone;
        this.testList = testList;
    }

    public int getIdCandidate() {
        return idCandidate;
    }

    public void setIdCandidate(int idCandidate) {
        this.idCandidate = idCandidate;
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

    public Set<TechnicalTest> getTestList() {
        return testList;
    }

    public void setTestList(Set<TechnicalTest> testList) {
        this.testList = testList;
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
        final Candidate other = (Candidate) obj;
        if (this.idCandidate != other.idCandidate) {
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
        if (!Objects.equals(this.testList, other.testList)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Candidate{" + "idCandidate=" + idCandidate + ", firstName=" + firstName + ", lastName=" + lastName + ", telephone=" + telephone + ", testList=" + testList + '}';
    }








}
