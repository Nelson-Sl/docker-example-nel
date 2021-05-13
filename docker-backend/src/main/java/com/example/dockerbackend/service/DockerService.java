package com.example.dockerbackend.service;

import com.example.dockerbackend.persistent.DockerEntity;
import com.example.dockerbackend.persistent.DockerRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class DockerService {
  private final DockerRepository dockerRepository;

  public DockerService(DockerRepository dockerRepository) {
    this.dockerRepository = dockerRepository;
  }

  public DockerEntity getHelloWorld() {
    List<DockerEntity> data = dockerRepository.findAll();
    return data.get(0);
  }
}
