package com.porsche.schoolapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class GenericEntity {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(name = "school_ulid", nullable = false, unique = true)
    private String schoolUlid;

    @Column(name = "audity_created_at", nullable = false)
    private LocalDateTime audityCreatedAt;

    @Column(name = "audity_updated_at", nullable = false)
    private LocalDateTime audityUpdatedAt;
}
