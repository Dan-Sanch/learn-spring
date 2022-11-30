package com.baeldung.ls.service;

import java.util.Optional;

import com.baeldung.ls.persistence.model.Project;
import org.springframework.stereotype.Service;

@Service
public interface IProjectService {
    Optional<Project> findById(Long id);

    Project save(Project project);
}
