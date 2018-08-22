package com.lostcities.lostcities.entity;

import javax.persistence.*;

@Entity
@Table(name="authorities")
public class Authorities {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column
    private String username;

    @Column
    private String authority;
}
