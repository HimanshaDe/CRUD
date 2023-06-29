package com.example.crudapplication.repository;

import com.example.crudapplication.model.AllianzUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<AllianzUser, Long> {


}
