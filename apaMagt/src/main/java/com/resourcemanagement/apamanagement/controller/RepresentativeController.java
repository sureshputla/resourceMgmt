package com.resourcemanagement.apamanagement.controller;

import com.resourcemanagement.apamanagement.model.Representative;
import com.resourcemanagement.apamanagement.model.RepresentativeDTO;
import com.resourcemanagement.apamanagement.repository.RepresentativeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RepresentativeController {

    @Autowired
    private RepresentativeRepository representativeRepository;

    @PostMapping(path = "representatives")
    public ResponseEntity<Representative> createRepresentative(@RequestBody RepresentativeDTO representativeDTO){
        Representative representative = new Representative(representativeDTO);
        return new ResponseEntity<>(representativeRepository.save(representative), HttpStatus.CREATED);
    }

    @GetMapping(path = "representatives")
    public ResponseEntity<List<Representative>> getAllRepresentatives(){
        List<Representative> representatives = representativeRepository.findAll(Sort.by("id"));
        return new ResponseEntity<>(representatives,HttpStatus.OK);
    }

    @GetMapping(path = "representatives/{id}")
    public ResponseEntity<Representative> getRepresentativeById(@PathVariable Integer id){
        Optional<Representative> representative = representativeRepository.findById((long)id);
        return representative.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.BAD_REQUEST));
    }
}
