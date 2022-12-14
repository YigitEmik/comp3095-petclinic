package java.petclinic.services;

import java.petclinic.model.Owner;
import java.util.Set;

public interface OwnerService {
    Owner findByLastname(String lastname);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
