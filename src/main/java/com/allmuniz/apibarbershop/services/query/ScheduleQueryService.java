package com.allmuniz.apibarbershop.services.query;

import com.allmuniz.apibarbershop.entities.ScheduleEntity;

import java.time.OffsetDateTime;
import java.util.List;

public interface ScheduleQueryService {

    ScheduleEntity findById(final long id);

    List<ScheduleEntity> findInMonth(final OffsetDateTime startAt, final OffsetDateTime endAt);

    void verifyIfScheduleExists(final OffsetDateTime startAt, final OffsetDateTime endAt);
}
