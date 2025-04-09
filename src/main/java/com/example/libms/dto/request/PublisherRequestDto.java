package com.example.libms.dto.request;

//name, address, and book
public record PublisherRequestDto(
        String name,
        AddressRequestDto address

) {

}
