package andrei.gherman.petclinic.services.map;

import andrei.gherman.petclinic.model.Vet;
import andrei.gherman.petclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends MapService<Vet,Long> implements CrudService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void deletebyID(Long id) {
        super.deleteById(id);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
