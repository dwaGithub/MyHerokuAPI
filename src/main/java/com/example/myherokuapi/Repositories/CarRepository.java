package com.example.myherokuapi.Repositories;

import com.example.myherokuapi.Models.Car;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
