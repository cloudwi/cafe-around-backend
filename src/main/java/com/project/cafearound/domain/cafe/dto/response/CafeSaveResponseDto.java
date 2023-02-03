package com.project.cafearound.domain.cafe.dto.response;

import com.project.cafearound.domain.cafe.entity.Cafe;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

@Builder
public record CafeSaveResponseDto(
    @NotBlank
    String cafeName,
    double latitude,
    double longitude
) {

    public static CafeSaveResponseDto toDto(Cafe cafe) {
        return CafeSaveResponseDto.builder()
            .cafeName(cafe.getName())
            .latitude(cafe.getLatitude())
            .longitude(cafe.getLongitude())
            .build();
    }
}
