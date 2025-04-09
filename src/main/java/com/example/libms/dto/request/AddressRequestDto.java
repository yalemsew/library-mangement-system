package com.example.libms.dto.request;

//don't maintain bidirection relationship in dto
public record AddressRequestDto(
        String street,
        String city,
        String state,
        String country,
        String zipCode
) {
}
