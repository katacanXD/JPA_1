package ru.netology.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "PERSONS")
public class Person {
    @EmbeddedId
    private PersonPrimaryKey personPrimaryKey;
    private String phoneOfNumber;
    private String cityOfLiving;
}
