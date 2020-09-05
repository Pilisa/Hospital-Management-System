package com.mpather47.git.services.employee.Impl;

import com.mpather47.git.entity.employee.Job;
import com.mpather47.git.entity.person.Contact;
import com.mpather47.git.factory.employee.JobFactory;
import com.mpather47.git.repository.employee.JobRepository;
import com.mpather47.git.repository.employee.impl.JobRepositoryImpl;
import com.mpather47.git.services.employee.JobService;
import com.mpather47.git.utility.Helper;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JobServiceImplTest {

    private static JobService service = JobServiceImpl.getService();
    private static Job job = JobFactory.createJob("Doctor");


    @Test
    public void d_getAll() {

        Set<Job> address = service.getAll();
        assertEquals(1,address.size());
        System.out.println("All people: " + address);
    }

    @Test
    public void a_create() {
        Job created = service.create(job);
        Assert.assertEquals(job.getJobTittle(),created.getJobTittle());
        System.out.println("Created:" + created);
    }

    @Test
    public void b_read() {
        Job read = service.read(job.getJobTittle());
        System.out.println("Read:" + read);
    }

    @Test
    public void c_update() {
        Job updated = new Job.Builder().copy(job).setjobTittle("Nurse").build();
        updated = service.update(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    public void e_delete() {
        boolean deleted = service.delete(job.getJobTittle());
        Assert.assertTrue(deleted);
    }
}