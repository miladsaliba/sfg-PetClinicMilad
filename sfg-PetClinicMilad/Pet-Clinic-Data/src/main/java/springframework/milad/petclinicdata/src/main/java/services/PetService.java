package springframework.milad.petclinicdata.src.main.java.services;

import springframework.milad.petclinicdata.src.main.java.model.Owner;
import springframework.milad.petclinicdata.src.main.java.model.Pet;
import java.util.Set;

public interface PetService {
    Pet findById(long id);
    Pet savePet(Pet pet);
    Set<Owner>  findAll();


}
