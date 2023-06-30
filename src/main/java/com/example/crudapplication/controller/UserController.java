package com.example.crudapplication.controller;

import com.example.crudapplication.model.AllianzUser;
import com.example.crudapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("getUsers")
    public List<AllianzUser> getUserList() {
        return userService.getUserList();

    }

    @PostMapping("/saveUsers")
    public void saveUser(@RequestBody AllianzUser allianzUser)
    {
         userService.saveUser(allianzUser);
    }

    @PutMapping("/updateusers/{id}")
    public void updateUser(@PathVariable("id") Long id,@RequestBody AllianzUser allianzUser){
        userService.updateUser(id,allianzUser);
    }

    @DeleteMapping("deleteuser/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
    }

}
