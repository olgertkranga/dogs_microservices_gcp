package com.example.dogs;

import org.springframework.stereotype.Repository;

import com.google.api.client.util.store.DataStoreFactory;

@Repository
public interface DogRepository extends DataStoreFactory {

	Iterable<Dog> findAll();

	Dog save(Dog dog);}