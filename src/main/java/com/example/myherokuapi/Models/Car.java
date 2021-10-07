package com.example.myherokuapi.Models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name="cars")
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String brand;

    @Column
    private int model;

    @Column
    private String type;

}
