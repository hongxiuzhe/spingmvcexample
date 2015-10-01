package com.dzhao.springmvc.codegen;

import java.util.List;

/**
 * Created by dzhao on 22/09/2015.
 */
public class RepositoryTemplate {
    private String modelPackageName;
    private String repositoryPackageName;
    private String modelSimpleName;
    private String repositorySimpleName;
    private List<String> repositoryMethods;

    public String getModelPackageName() {
        return modelPackageName;
    }

    public void setModelPackageName(String modelPackageName) {
        this.modelPackageName = modelPackageName;
    }

    public String getRepositoryPackageName() {
        return repositoryPackageName;
    }

    public void setRepositoryPackageName(String repositoryPackageName) {
        this.repositoryPackageName = repositoryPackageName;
    }

    public String getModelSimpleName() {
        return modelSimpleName;
    }

    public void setModelSimpleName(String modelSimpleName) {
        this.modelSimpleName = modelSimpleName;
    }

    public String getRepositorySimpleName() {
        return repositorySimpleName;
    }

    public void setRepositorySimpleName(String repositorySimpleName) {
        this.repositorySimpleName = repositorySimpleName;
    }

    public List<String> getRepositoryMethods() {
        return repositoryMethods;
    }

    public void setRepositoryMethods(List<String> repositoryMethods) {
        this.repositoryMethods = repositoryMethods;
    }
}
