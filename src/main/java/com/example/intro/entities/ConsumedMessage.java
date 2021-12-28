package com.example.intro.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name = "messages")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ConsumedMessage implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "intexample")
    int intexample;

    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    Date date;
}
