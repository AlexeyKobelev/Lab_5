package com.Lab_5.SimpleWebApp4.repository;

import com.Lab_5.SimpleWebApp4.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRep extends JpaRepository<Worker, Long>{
}
