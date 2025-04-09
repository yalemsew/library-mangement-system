package com.example.libms.service;

import com.example.libms.dto.request.PublisherRequestDto;
import com.example.libms.dto.response.PublisherResponseDto;
import com.example.libms.model.Publisher;

import java.util.List;
import java.util.Optional;

public interface PublisherService {
    //create
    Optional<PublisherResponseDto> createPublisher(Publisher publisher);
    //find
    Optional<PublisherResponseDto> findPublisherByName(String name);
    //find all
    List<PublisherResponseDto> findAllPublisher();
    //update
    Optional<PublisherResponseDto> updatePublisher(String name, PublisherRequestDto publisherRequestDto);
}
