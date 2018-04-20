package com.example.BirdApp.service;

import com.example.BirdApp.model.Bird;
import com.example.BirdApp.repository.IBirdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by araam on 8/25/17.
 */

//@Service
//public class BirdService {

@Service
public class BirdService implements IBirdRepository {
    private IBirdRepository repository;

    @Autowired
    public void setRepository(IBirdRepository repository) {
        this.repository = repository;
    }

    public List<Bird> findAll() {
        return this.repository.findAll();
    }

    public Bird save(Bird bird) {
        return this.repository.save(bird);
    }

    //    public Page<Bird> findAll(int page) {
//        PageRequest pageRequest = new PageRequest(page, 50);
//        return this.repository.findAll(pageRequest);
//    }

//    public Bird get(int id) {
//        System.out.println("in BirdService, get() for id = " + id);
//        return new Bird(1, "American Robin", "cheery", "photo");
//    }
//
//    public Bird update(int id, Bird bird) {
//        System.out.println("in BirdService, update() for id = " + id);
//        return new Bird(1, "American Robin", "cheery", "photo");
//    }
//
//    public Bird delete(int id) {
//        System.out.println("in BirdService, delete() for id = " + id);
//        return new Bird(1, "American Robin", "cheery", "photo");
//    }

//    public Bird save(Bird bird) {
//        return repository.save(bird);
//    }
}
