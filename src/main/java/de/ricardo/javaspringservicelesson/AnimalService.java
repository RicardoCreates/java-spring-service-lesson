package de.ricardo.javaspringservicelesson;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AnimalService {

    private final AnimalRepository animalRepository;

    public List<Animal> getAnimals(){
        return animalRepository.findAll();
    }

    public Animal save(Animal animal){
        Animal NewAnimal = new Animal(UUID.randomUUID().toString(), animal.name(), animal.age());
        return animalRepository.save(animal);
    }
}
