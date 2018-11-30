/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.TechnicalTesting.Web;

import com.ensi.ilsi.TechnicalTesting.Domain.Candidate;
import com.ensi.ilsi.TechnicalTesting.Domain.Manager;
import com.ensi.ilsi.TechnicalTesting.Service.CandidateService;
import com.ensi.ilsi.TechnicalTesting.Service.ManagerService;
import com.ensi.ilsi.TechnicalTesting.Web.dto.CandidateDto;
import com.ensi.ilsi.TechnicalTesting.Web.dto.ManagerDto;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 *
 * @author Toshiba-PC
 */
public class ManagerResource {

    private final ManagerService managerService;

    public ManagerResource(ManagerService managerService) {
        this.managerService = managerService;
    }


    @GetMapping
    public List<ManagerDto> findAll(){
        return this.managerService.findAll();
    }


    @GetMapping("/{id}")
    public ManagerDto findById(@PathVariable int id) {
        return this.managerService.findById(id);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        this.managerService.delete(id);
    }
}
