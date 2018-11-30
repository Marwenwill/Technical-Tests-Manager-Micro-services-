/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.TechnicalTesting.Web;

import com.ensi.ilsi.TechnicalTesting.Domain.Candidate;
import com.ensi.ilsi.TechnicalTesting.Service.CandidateService;
import com.ensi.ilsi.TechnicalTesting.Web.dto.CandidateDto;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Toshiba-PC
 */
@RestController
@RequestMapping("/candidates")
public class CandidateRessource {

    private final CandidateService candidateService;

    public CandidateRessource(CandidateService candidateService) {
        this.candidateService = candidateService;
    }


    @GetMapping
    public List<Candidate> findAll(){
        return this.candidateService.findAll();
    }


    @GetMapping("/{id}")
    public Candidate findById(@PathVariable int id) {
        return this.candidateService.findById(id);
    }


    @PostMapping
    public CandidateDto create(CandidateDto candidateDto){
        return this.candidateService.create(candidateDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        this.candidateService.deleteById(id);
    }
}
