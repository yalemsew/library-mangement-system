package com.example.libms.dto.response;

public record PublisherResponseDto(
        Long id,
        String name,
        AddressResponseDto address
) {
}
