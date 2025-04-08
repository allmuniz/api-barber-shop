package com.allmuniz.apibarbershop.services;

import com.allmuniz.apibarbershop.entities.ClientEntity;

public interface ClientService {

    ClientEntity save(final ClientEntity entity);

    ClientEntity update(final ClientEntity entity);

    void delete(final long id);
}
