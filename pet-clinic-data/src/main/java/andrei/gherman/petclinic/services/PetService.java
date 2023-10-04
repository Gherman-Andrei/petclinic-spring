package andrei.gherman.petclinic.services;


import andrei.gherman.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);

    Set<Pet> findAll();
}
