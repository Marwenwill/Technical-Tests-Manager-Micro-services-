package com.ensi.ilsi.TechnicalTesting.Service;

import com.ensi.ilsi.TechnicalTesting.Domain.Candidate;
import com.ensi.ilsi.TechnicalTesting.Domain.TechnicalTest;
import com.ensi.ilsi.TechnicalTesting.Repository.CandidateRepository;
import com.ensi.ilsi.TechnicalTesting.Web.dto.CandidateDto;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;





@Service
public class CandidateService {

    private final Logger log = LoggerFactory.getLogger(CandidateService.class);

    private final CandidateRepository candidateRepository;

    public CandidateService(CandidateRepository candidateRepository) {

        this.candidateRepository = candidateRepository;
    }

    public CandidateDto create(CandidateDto candidateDto){
        log.debug("Request to create Candidate", candidateDto);
        return mapToDto(
                this.candidateRepository.save(
                        new Candidate(
                                candidateDto.getFirstName(),
                                candidateDto.getLastName(),
                                candidateDto.getTelephone(),
                                (Set<TechnicalTest>) Collections.EMPTY_LIST)
                )
        );
    }


    public List<Candidate> findAll(){
        log.debug("Request to get all candidates");
        return this.candidateRepository.findAll();
    }


    @Transactional(readOnly = true)
    public Candidate findById(int id){
        log.debug("Request to get Candidate : {}", id);
        return this.candidateRepository.findById(id).orElse(null);
    }


    public void deleteById(int id){
        log.debug("Request to delete Candidate : {}", id);
        this.candidateRepository.deleteById(id);
    }

    public static CandidateDto mapToDto(Candidate candidate) {
        if (candidate != null) {
            return new CandidateDto(
                    candidate.getIdCandidate(),
                    candidate.getFirstName(),
                    candidate.getLastName(),
                    candidate.getTelephone()
            );
        }
        return null;
    }
}
    
    