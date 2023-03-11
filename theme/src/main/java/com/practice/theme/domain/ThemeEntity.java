package com.practice.theme.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "theme")
public class ThemeEntity {
    @Id
    private Long id;

    private String title;
    private String shop;
    private String address;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public ThemeDTO toDto() {
        return ThemeDTO.builder()
                .id(this.id)
                .title(this.title)
                .address(this.address)
                .build();
    }
}
