package com.Lab_5.SimpleWebApp4.service.impl;

import com.Lab_5.SimpleWebApp4.entity.Worker;
import com.Lab_5.SimpleWebApp4.repository.WorkerRep;
import com.Lab_5.SimpleWebApp4.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService{
    @Autowired
    private WorkerRep workerRepository;
    @Override
    public List<Worker> findAllWorker() {
        return workerRepository.findAll();
    }
}
