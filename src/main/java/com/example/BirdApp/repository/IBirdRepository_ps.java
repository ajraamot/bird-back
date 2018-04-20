package com.example.BirdApp.repository;

import com.example.BirdApp.model.Bird;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BirdApp.model.Bird_ps;

import java.util.Collection;

/**
 * Created by araam on 9/14/17.
 */
public interface IBirdRepository_ps extends JpaRepository<Bird_ps, Integer> {

//    Iterable<Bird> findAndfilterByRegion(Collection<String> regions); // trying to allow to filter by region, similar to what was done in https://stackoverflow.com/questions/31107590/spring-data-jparepository-findalliterableid-ids-findallsort-sort
}
