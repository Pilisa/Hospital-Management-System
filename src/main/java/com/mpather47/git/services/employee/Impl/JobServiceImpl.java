package com.mpather47.git.services.employee.Impl;

import com.mpather47.git.entity.employee.Employee;
import com.mpather47.git.entity.employee.Job;
import com.mpather47.git.repository.employee.EmployeeRepository;
import com.mpather47.git.repository.employee.JobRepository;
import com.mpather47.git.repository.employee.impl.EmployeeRepositoryImpl;
import com.mpather47.git.repository.employee.impl.JobRepositoryImpl;
import com.mpather47.git.services.employee.EmployeeService;
import com.mpather47.git.services.employee.JobService;

import java.util.Set;

public class JobServiceImpl implements JobService {

    private static JobService service=null;
    private JobRepository repository;

    private JobServiceImpl() {
        this.repository = JobRepositoryImpl.getRepository();
    }

    public static JobService getService(){
        if(service==null) service = new JobServiceImpl();
        return service;
    }


    @Override
    public Set<Job> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Job create(Job job) {
        return this.repository.create(job);
    }

    @Override
    public Job read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Job update(Job job) {
        return this.repository.update(job);
    }

    @Override
    public boolean delete(String s) {
        return this.repository.delete(s);

    }
}