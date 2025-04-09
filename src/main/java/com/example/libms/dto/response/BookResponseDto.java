package com.example.libms.dto.response;

import java.util.List;

public record BookResponseDto(
        Long id,
        String title,
        String isbn,
        List<AuthorResponseDto> authorResponseDtoList,
        PublisherResponseDto publisherResponseDto
) {
}
