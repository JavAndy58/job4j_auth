package ru.job4j.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import lombok.Data;

@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userName;
    private String userSurname;
    private String itn;
    private Timestamp created;
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Person> persons = new HashSet<>();
}
