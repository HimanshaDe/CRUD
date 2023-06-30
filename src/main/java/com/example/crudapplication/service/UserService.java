package com.example.crudapplication.service;

import com.example.crudapplication.model.AllianzUser;
import com.example.crudapplication.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepo userrepo;

    public List<AllianzUser> getUserList() {
        System.out.println(userrepo.findAll());
        return userrepo.findAll();
    }

    public AllianzUser saveUser(@RequestBody AllianzUser allianzUser){
        return userrepo.save(allianzUser);
    }

    public AllianzUser updateUser( AllianzUser allianzUser) {

        AllianzUser allianzUser1 = userrepo.findById(allianzUser.getId()).orElseThrow();
                allianzUser1.setFirstname(allianzUser.getFirstname());
                allianzUser1.setLastname(allianzUser.getLastname());
                allianzUser1.setEmail_id(allianzUser.getEmail_id());
        userrepo.save(allianzUser1);
        return null;
    }

    public void deleteUser(Long id) {
        userrepo.deleteById(id);
    }

    public AllianzUser getUserById(Long id) {
        return userrepo.findById(id)
                .orElseThrow(()->new NoSuchElementException("User not found"));

    }


//    public ResponseEntity<?> saveUser(@RequestBody AllianzUser allianzUser){
//        return new ResponseEntity<>(userrepo.save(allianzUser), HttpStatus.OK);
//    }

}
