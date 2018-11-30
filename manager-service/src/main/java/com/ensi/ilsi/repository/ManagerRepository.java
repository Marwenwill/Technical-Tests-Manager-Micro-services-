/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.TechnicalTesting.Repository;

import com.ensi.ilsi.TechnicalTesting.Domain.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 *
 * @author Toshiba-PC
 */
@Repository
public interface ManagerRepository extends JpaRepository<Manager, Integer>{

}
