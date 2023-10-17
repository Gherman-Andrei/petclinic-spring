package andrei.gherman.petclinic.services.map;

import andrei.gherman.petclinic.model.Pet;
import andrei.gherman.petclinic.services.PetService;

import java.util.Set;

public class PetServiceMap extends MapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void deletebyID(Long id) {
        super.deleteById(id);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
