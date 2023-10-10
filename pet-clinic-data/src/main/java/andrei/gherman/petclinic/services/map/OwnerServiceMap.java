package andrei.gherman.petclinic.services.map;

import andrei.gherman.petclinic.model.Owner;
import andrei.gherman.petclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends MapService<Owner, Long> implements CrudService<Owner, Long > {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void deletebyID(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
