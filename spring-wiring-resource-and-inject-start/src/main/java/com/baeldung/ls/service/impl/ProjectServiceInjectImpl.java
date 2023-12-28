package com.baeldung.ls.service.impl;

import com.baeldung.ls.persistence.model.Project;
import com.baeldung.ls.persistence.repository.IProjectRepository;
import com.baeldung.ls.service.IProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Optional;

@Service
public class ProjectServiceInjectImpl implements IProjectService {
    private IProjectRepository projectRepository;

    private static final Logger LOG = LoggerFactory.getLogger(ProjectServiceInjectImpl.class);

    @Override
    public Optional<Project> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Project save(Project project) {
        return null;
    }

    @Inject
    public ProjectServiceInjectImpl(@Named("projectRepositoryImpl") IProjectRepository projectRepository){
        this.projectRepository = projectRepository;
        LOG.info("wired projectRepository instance {}", projectRepository);
    }
}
