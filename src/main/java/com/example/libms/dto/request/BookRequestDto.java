package com.example.libms.dto.request;

import java.util.List;

public record BookRequestDto(
        String title,
        String isbn,
        List<AuthorRequestDto> author,
        PublisherRequestDto publisher
        ) {
}
