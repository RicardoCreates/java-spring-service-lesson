package de.ricardo.javaspringservicelesson;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/animals")
@RequiredArgsConstructor
public class AnimalController {

    private final AnimalService animalService;

    @GetMapping()
    public List<Animal> getAnimals() {
        return animalService.getAnimals();
    }

    @PostMapping()
    public Animal postAnimal(@RequestBody Animal animal) {
        return animalService.save(animal);
    }

}
