/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.repository;


import com.ensi.ilsi.domain.TechnicalTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author hajer
 */
@Repository
public interface TechnicalTestRepository extends JpaRepository<TechnicalTest, Integer> {
    public TechnicalTest findById(int id);
    public List<TechnicalTest> findAll();
}

