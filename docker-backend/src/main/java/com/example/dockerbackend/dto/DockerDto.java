package com.example.dockerbackend.dto;

import com.example.dockerbackend.persistent.DockerEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class DockerDto {
  private String type;

  public static DockerDto toDto (DockerEntity dockerEntity) {
    return DockerDto.builder()
        .type(dockerEntity.getType())
        .build();
  }
}
