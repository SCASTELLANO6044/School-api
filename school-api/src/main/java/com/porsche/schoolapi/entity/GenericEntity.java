package com.porsche.schoolapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class GenericEntity {
    @Id
    private Long id;

    @Column(name = "school_ulid", nullable = false, unique = true)
    private String schoolUlid;
}
