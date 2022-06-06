package com.technova.userservice.model;


import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String firstName;


    @Column
    private String lastName;

    @Column
    private String email;

}
