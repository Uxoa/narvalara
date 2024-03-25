package com.navarlara.backend.persistence;

import com.navarlara.backend.domain.HealthRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface HealthRecordRepository extends JpaRepository<HealthRecord, Long> {

}