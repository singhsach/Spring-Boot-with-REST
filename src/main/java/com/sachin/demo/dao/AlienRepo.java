package com.sachin.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sachin.demo.model.Alien;


public interface AlienRepo extends JpaRepository<Alien, Integer> 
{

}
