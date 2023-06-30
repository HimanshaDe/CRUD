package com.example.crudapplication.controller;

import com.example.crudapplication.model.AllianzUser;
import com.example.crudapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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


    @GetMapping("/getuser/{id}")
    public ResponseEntity<AllianzUser> getUserById(@PathVariable Long id) {
        AllianzUser allianzUser = userService.getUserById(id);
        System.out.println(allianzUser);
        return ResponseEntity.ok(allianzUser);
        
    }
    @PutMapping("/updateusers/{id}")
    public ResponseEntity<AllianzUser> updateUser(@PathVariable("id") Long id, @RequestBody AllianzUser allianzUser){
        allianzUser.setId(id);
        AllianzUser allianzUser1 = userService.updateUser(allianzUser);

        return ResponseEntity.ok(allianzUser1);
    }

    @DeleteMapping("deleteuser/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
    }

}
