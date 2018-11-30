
package com.ensi.ilsi.web;


import com.ensi.ilsi.domain.TechnicalTest;
import com.ensi.ilsi.service.TechnicalTestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
@RequestMapping("/TechnicalTest")
public class TechnicalResource {

    private final TechnicalTestService technicalTestService;

    public TechnicalResource(TechnicalTestService technicalTestService) {
        this.technicalTestService = technicalTestService;
    }

    @GetMapping
    public List<TechnicalTest> findAll() {
        return this.technicalTestService.findAll();
    }

    @GetMapping("/{id}")
    public TechnicalTest findById(@PathVariable int id) {
        return this.technicalTestService.findById(id);
    }

    @PostMapping
    public TechnicalTest create(@RequestBody TechnicalTest t) {
        return this.technicalTestService.create(t);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        this.technicalTestService.delete(id);
    }
    
}
