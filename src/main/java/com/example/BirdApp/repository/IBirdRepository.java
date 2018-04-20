package com.example.BirdApp.repository;
/**
 * Created by araam on 8/25/17.
 */

import com.example.BirdApp.model.Bird;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

// in Pluralsight course, he did something like (the int is the type of the primary key)
// public interface IBirdRepository extends JpaRepository<Bird, int> {}
public interface IBirdRepository {
    public Bird save(Bird bird);
    public List<Bird> findAll();

//    public Page<Bird> findAll(PageRequest pageRequest);
//    public Bird create(Bird bird);
}
