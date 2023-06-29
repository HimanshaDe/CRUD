package com.example.crudapplication.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="allianz_user")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AllianzUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name ="first_name")
    private String firstname;

    @Column(name="last_name")
    private String lastname;

    @Column(name="emailId")
    private String email_id;

}
