package com.example.helloworld.repositories;

import com.example.helloworld.controller.HelloWorldController;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HelloRepository extends JpaRepository<HelloWorldController, Long> {

}
