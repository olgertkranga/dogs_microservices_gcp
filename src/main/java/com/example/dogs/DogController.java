package com.example.dogs;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.ImmutableList;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequiredArgsConstructor
public class DogController {

  private final DogRepository dogRepository = null;

  @GetMapping("/api/v1/dogs")
  public Iterable<Dog> getAllDogs() {
    //log.debug("->getAllDogs");
    return dogRepository.findAll();
  }

  @PostMapping("/api/v1/dogs")
  public Dog saveDog(@RequestBody Dog dog) {
    //log.debug("->saveDog {}", dog);
    return dogRepository.save(dog);
  }
}