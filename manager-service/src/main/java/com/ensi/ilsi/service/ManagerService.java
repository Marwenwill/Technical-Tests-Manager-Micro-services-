/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.TechnicalTesting.Service;

import com.ensi.ilsi.TechnicalTesting.Domain.Candidate;
import com.ensi.ilsi.TechnicalTesting.Domain.Manager;
import com.ensi.ilsi.TechnicalTesting.Domain.TechnicalTest;
import com.ensi.ilsi.TechnicalTesting.Repository.ManagerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;

import com.ensi.ilsi.TechnicalTesting.Web.dto.ManagerDto;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 *
 * @author Toshiba-PC
 */
@Service
public class ManagerService {

    private final Logger log = LoggerFactory.getLogger(ManagerService.class);

    private final ManagerRepository managerRepository;

    public ManagerService(ManagerRepository managerRepository) {

        this.managerRepository = managerRepository;
    }


    public List<ManagerDto> findAll(){
        log.debug("Request to get all Managers");
        return this.managerRepository.findAll()
                .stream()
                .map(ManagerService::mapToDto)
                .collect(Collectors.toList());
    }



    public ManagerDto findById(int id) {
        log.debug("Request to get Customer : {}", id);
        return this.managerRepository.findById(id).map(ManagerService::mapToDto).orElse(null);
    }


    public void delete(int id){
        log.debug("Request to delete manager : {}", id);
        this.managerRepository.deleteById(id);
    }


    public void testToCandidate(TechnicalTest t, Candidate c){
        c.getTestList().add(t);
    }



    public static ManagerDto mapToDto(Manager manager) {
        if (manager != null) {
            return new ManagerDto(
                    manager.getIdManger(),
                    manager.getFirstName(),
                    manager.getLastName(),
                    manager.getTelephone()
            );
        }
        return null;
    }
}

