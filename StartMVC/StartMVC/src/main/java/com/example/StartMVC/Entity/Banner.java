package com.example.StartMVC.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "banner")
public class Banner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String src;

    String srcContent;

}
