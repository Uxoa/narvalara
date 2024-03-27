package com.navarlara.backend.persistence;

import com.navarlara.backend.domain.Certification;
import com.navarlara.backend.domain.Dog;
import com.navarlara.backend.domain.HealthRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface DogRepository extends CrudRepository<Dog, Long> {
   Dog getDogById(Long id);
   List<Dog> findByName(String name);
   
   
}