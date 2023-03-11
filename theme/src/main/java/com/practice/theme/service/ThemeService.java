package com.practice.theme.service;

import com.practice.exceptions.DefinedExceptions;
import com.practice.theme.domain.ThemeDTO;
import com.practice.theme.repository.ThemeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ThemeService {
    private final ThemeRepository themeRepository;

    public ThemeDTO getTheme(Long id) {
        return themeRepository
                .findById(id)
                .orElseThrow(() -> DefinedExceptions.notFoundException)
                .toDto();
    }
}
