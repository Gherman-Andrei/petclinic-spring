package andrei.gherman.petclinic.services;

import andrei.gherman.petclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
