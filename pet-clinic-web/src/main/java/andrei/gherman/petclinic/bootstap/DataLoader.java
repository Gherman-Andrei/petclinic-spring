package andrei.gherman.petclinic.bootstap;

import andrei.gherman.petclinic.model.Owner;
import andrei.gherman.petclinic.model.Vet;
import andrei.gherman.petclinic.services.OwnerService;
import andrei.gherman.petclinic.services.VetService;
import andrei.gherman.petclinic.services.map.OwnerServiceMap;
import andrei.gherman.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerSerice;
    private final VetService vetService;


    public DataLoader() {
        ownerSerice = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Andrei");
        owner1.setLastName("Gherman");
        ownerSerice.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Sergiu");
        owner2.setLastName("Stefan");
        ownerSerice.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sebastian");
        vet1.setLastName("Deaconu");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Andrei");
        vet2.setLastName("Ciufu");
        vetService.save(vet2);

        System.out.println("Loaded vets.....");

    }
}
