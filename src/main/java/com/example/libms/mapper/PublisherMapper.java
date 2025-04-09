package com.example.libms.mapper;

import com.example.libms.dto.request.PublisherRequestDto;
import com.example.libms.dto.response.PublisherResponseDto;
import com.example.libms.model.Publisher;
import com.example.libms.repository.PublisherRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PublisherMapper {

    //mapper method => map from publisherRequestDto to publisher
    @Mapping(source = "addressRequestDto", target = "address")
    Publisher toPublisher(PublisherRequestDto publisherRequestDto);

    //mapper method => map from publisher to publisherResponseDto
    @Mapping(source = "address", target = "addressResponseDto")
    PublisherResponseDto publisherToPublisherResponseDto(Publisher publisher);
}
