package springframework.milad.petclinicdata.src.main.java.services;

import springframework.milad.petclinicdata.src.main.java.model.Owner;

import java.util.Set;

public interface OwnerService {


    Owner findById(long id);
    Owner SaveOwner(Owner owner);
    Owner findByName(String firstName, String lastName);

    Owner findByLastName(String lastName);
    Set<Owner> findAll();


}
