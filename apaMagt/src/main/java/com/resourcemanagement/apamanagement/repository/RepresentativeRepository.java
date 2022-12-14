package com.resourcemanagement.apamanagement.repository;

import com.resourcemanagement.apamanagement.model.Representative;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface RepresentativeRepository extends JpaRepository<Representative, Long> {
}
