package com.navarlara.backend.persistence;

import com.navarlara.backend.domain.Certification;
import com.navarlara.backend.domain.Dog;
import com.navarlara.backend.domain.HealthRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface DogRepository extends JpaRepository<Dog, Long> {

}