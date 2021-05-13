package com.example.dockerbackend.persistent;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DockerRepository extends CrudRepository<DockerEntity, Long> {
  List<DockerEntity> findAll();
}
