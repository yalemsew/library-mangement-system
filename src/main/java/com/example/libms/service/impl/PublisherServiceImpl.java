package com.example.libms.service.impl;

import com.example.libms.dto.request.PublisherRequestDto;
import com.example.libms.dto.response.AddressResponseDto;
import com.example.libms.dto.response.PublisherResponseDto;
import com.example.libms.model.Address;
import com.example.libms.model.Publisher;
import com.example.libms.repository.PublisherRepository;
import com.example.libms.service.PublisherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PublisherServiceImpl implements PublisherService {

    private final PublisherRepository publisherRepository;
    @Override
    public Optional<PublisherResponseDto> createPublisher(PublisherRequestDto publisherRequestDto) {
        // from publisherRequestDto to publisher
        Publisher publisher = new Publisher(
                publisherRequestDto.name()
        );
        publisher.setAddress(
                new Address(
                        publisherRequestDto.addressRequestDto().street() ,
                        publisherRequestDto.addressRequestDto().city(),
                        publisherRequestDto.addressRequestDto().state(),
                        publisherRequestDto.addressRequestDto().country(),
                        publisherRequestDto.addressRequestDto().zipCode()
                )
        );
        Publisher savedPublisher = publisherRepository.save(publisher);

        PublisherResponseDto publisherResponseDto = new PublisherResponseDto(
                savedPublisher.getId(),
                savedPublisher.getName(),
                new AddressResponseDto(
                        savedPublisher.getAddress().getStreet(),
                        savedPublisher.getAddress().getCity(),
                        savedPublisher.getAddress().getState(),
                        savedPublisher.getAddress().getCountry(),
                        savedPublisher.getAddress().getZipCode()

                           savedPublisher.getAddress().getStreet(),
                        savedPublisher.getAddress().getStreet(),
                        savedPublisher.getAddress().getCity(),
                        savedPublisher.getAddress().getState()

                )
        );
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
