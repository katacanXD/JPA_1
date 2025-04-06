package ru.netology.jpa.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Data
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class PersonPrimaryKey implements Serializable {
    @Id
    @Column
    private String name;
    @Id
    @Column
    private String surname;
    @Id
    @Column
    private int age;
    @Column(name = "phoneOfNumber")
    private String phoneNumber;
    @Column(name = "cityOfLiving")
    private String city;
}
