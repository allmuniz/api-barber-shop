package com.allmuniz.apibarbershop.services.impl;

import com.allmuniz.apibarbershop.entities.ScheduleEntity;
import com.allmuniz.apibarbershop.repositories.ScheduleRepository;
import com.allmuniz.apibarbershop.services.ScheduleService;
import com.allmuniz.apibarbershop.services.query.ScheduleQueryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ScheduleServiceImpl implements ScheduleService {

    private final ScheduleRepository repository;
    private final ScheduleQueryService queryService;

    @Override
    public ScheduleEntity save(final ScheduleEntity entity) {
        queryService.verifyIfScheduleExists(entity.getStartAt(), entity.getEndAt());

        return repository.save(entity);
    }

    @Override
    public void delete(final long id) {
        queryService.findById(id);
        repository.deleteById(id);
    }
}
