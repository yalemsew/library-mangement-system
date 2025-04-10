package com.example.libms.mapper;

import com.example.libms.dto.request.AddressRequestDto;
import com.example.libms.dto.response.AddressResponseDto;
import com.example.libms.model.Address;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AddressMapper {
    Address toAddress(AddressRequestDto addressRequestDto);

    AddressResponseDto toAddressResponseDto(Address address);
}