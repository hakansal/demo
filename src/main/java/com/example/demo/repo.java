package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import users.user;
public interface repo extends JpaRepository<user,Long> {



}
