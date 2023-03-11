package com.practice.theme.domain;

import lombok.Builder;

public record ThemeDTO(
        Long id,
        String title,
        String address
) {
    @Builder public ThemeDTO {}
}
