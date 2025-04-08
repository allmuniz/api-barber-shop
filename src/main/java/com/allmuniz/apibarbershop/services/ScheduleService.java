package com.allmuniz.apibarbershop.services;

import com.allmuniz.apibarbershop.entities.ScheduleEntity;

public interface ScheduleService {

    ScheduleEntity save(final ScheduleEntity entity);

    void delete(final long id);
}
