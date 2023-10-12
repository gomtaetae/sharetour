package com.kosa.ShareTour.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="admin")
@Getter
@Setter
@ToString
public class Admin extends BaseTimeEntity{

    @Id
    @Column(name="admin_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="name", length = 50, nullable = false)
    private String name;

    @Column(name="password", nullable = false)
    private String password;

}