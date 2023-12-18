package com.herman87.cofeemanagementapi.POJO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "t_user")
public class User {
    private static final long serialVersionUUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "c_id")
    private Integer id;
    @Column(name = "c_name")
    private String name;
    @Column(name = "c_phone")
    private String phone;
    @Column(name = "c_email")
    private String email;
    @Column(name = "c_password")
    private String password;
    @Column(name = "c_status")
    private String status;
    @Column(name = "c_role")
    private String role;
}
