package com.example.libms.dto.response;

public record AddressResponseDto(
        Long id,
        String street,
        String city,
        String state,
        String zip
) {
}
