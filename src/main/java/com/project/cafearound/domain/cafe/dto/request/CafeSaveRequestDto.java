package com.project.cafearound.domain.cafe.dto.request;

import com.project.cafearound.domain.cafe.entity.Cafe;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

@Builder
public record CafeSaveRequestDto(
    @NotBlank
    String cafeName,
    double latitude,
    double longitude
) {

  public Cafe toEntity() {
    return Cafe.builder()
        .name(this.cafeName)
        .latitude(this.latitude)
        .longitude(this.longitude)
        .build();
  }
}
