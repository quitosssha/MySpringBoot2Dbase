package ru.arkhipov.MySpringBoot2Dbase.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "SUBJECTS")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    /// Количество зачетных единиц
    @Column(name = "credits")
    private int credits;

    @Column(name = "department")
    private String department;

}
