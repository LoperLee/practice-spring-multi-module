package com.practice.theme.repository;

import com.practice.theme.domain.ThemeEntity;
import org.springframework.data.repository.CrudRepository;

public interface ThemeRepository extends CrudRepository<ThemeEntity, Long> {
}
