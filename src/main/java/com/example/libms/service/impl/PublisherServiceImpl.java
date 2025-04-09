package com.example.libms.service.impl;

import com.example.libms.dto.request.PublisherRequestDto;
import com.example.libms.dto.response.PublisherResponseDto;
import com.example.libms.mapper.PublisherMapper;
import com.example.libms.model.Publisher;
import com.example.libms.repository.PublisherRepository;
import com.example.libms.service.PublisherService;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PublisherServiceImpl implements PublisherService {
    PublisherServiceImpl INSTANCE = Mappers.getMapper( PublisherServiceImpl.class );


    private final PublisherRepository publisherRepository;
    private final PublisherMapper publisherMapper;

    @Override
    public Optional<PublisherResponseDto> createPublisher(PublisherRequestDto publisherRequestDto) {
        // from publisherRequestDto to publisher
        Publisher publisher = publisherMapper.toPublisher(publisherRequestDto);

        Publisher savedPublisher = publisherRepository.save(publisher);

        PublisherResponseDto publisherResponseDto = publisherMapper.publisherToPublisherResponseDto(savedPublisher);

        return Optional.ofNullable(publisherResponseDto);

    }

    @Override
    public Optional<PublisherResponseDto> findPublisherByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<PublisherResponseDto> findAllPublisher() {
        return null;
    }

    @Override
    public Optional<PublisherResponseDto> updatePublisher(String name, PublisherRequestDto publisherRequestDto) {
        return Optional.empty();
    }
}
