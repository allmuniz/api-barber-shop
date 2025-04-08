package com.allmuniz.apibarbershop.mapper;

import com.allmuniz.apibarbershop.controllers.request.SaveClientRequest;
import com.allmuniz.apibarbershop.controllers.request.UpdateClientRequest;
import com.allmuniz.apibarbershop.controllers.response.ClientDetailResponse;
import com.allmuniz.apibarbershop.controllers.response.ListClientResponse;
import com.allmuniz.apibarbershop.controllers.response.SaveClientResponse;
import com.allmuniz.apibarbershop.controllers.response.UpdateClientResponse;
import com.allmuniz.apibarbershop.entities.ClientEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface ClientMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "schedules", ignore = true)
    ClientEntity toEntity(final SaveClientRequest request);

    SaveClientResponse toSaveResponse(final ClientEntity entity);

    @Mapping(target = "schedules", ignore = true)
    ClientEntity toEntity(final long id, final UpdateClientRequest request);

    UpdateClientResponse toUpdateResponse(final ClientEntity entity);

    ClientDetailResponse toDetailResponse(final ClientEntity entity);

    List<ListClientResponse> toListResponse(final List<ClientEntity> entities);
}
