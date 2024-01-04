package com.baeldung.ls.service.impl;

import java.util.Optional;

import com.baeldung.ls.persistence.repository.impl.ProjectRepositoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.baeldung.ls.persistence.model.Project;
import com.baeldung.ls.persistence.repository.IProjectRepository;
import com.baeldung.ls.service.IProjectService;

@Service
public class ProjectServiceImpl implements IProjectService {

    private static final Logger LOG = LoggerFactory.getLogger(ProjectRepositoryImpl.class);
    private IProjectRepository projectRepository;

    public ProjectServiceImpl(IProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Optional<Project> findById(Long id) {
        LOG.info("Project service >> Finding project by ID {} ", id);
        return projectRepository.findById(id);
    }

    @Override
    public Project save(Project project) {
        LOG.info("Project Service >> Saving Project");
        return projectRepository.save(project);
    }

}
