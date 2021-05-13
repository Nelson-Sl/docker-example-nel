package com.example.dockerbackend.controller;


import com.example.dockerbackend.dto.DockerDto;
import com.example.dockerbackend.service.DockerService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class DockerController {
  private final DockerService dockerService;

  public DockerController(DockerService dockerService) {
    this.dockerService = dockerService;
  }

  @GetMapping("/helloWorld")
  public DockerDto getHelloWorld() {
    return DockerDto.toDto(dockerService.getHelloWorld());
  }
}
