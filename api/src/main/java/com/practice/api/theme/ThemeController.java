package com.practice.api.theme;

import com.practice.theme.service.ThemeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/theme")
@RequiredArgsConstructor
public class ThemeController {
    private final ThemeService themeService;

    @GetMapping("/{themeId}")
    public ResponseEntity<?> getTheme(Long themeId) {
        return ResponseEntity.ok(themeService.getTheme(themeId));
    }
}
