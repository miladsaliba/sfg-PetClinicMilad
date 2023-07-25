package springframework.milad.petclinicdata.src.main.java.services;

import springframework.milad.petclinicdata.src.main.java.model.Pet;
import springframework.milad.petclinicdata.src.main.java.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(long id);
    Vet savePet(Pet pet);
    Set<Vet>  findAll();


}
