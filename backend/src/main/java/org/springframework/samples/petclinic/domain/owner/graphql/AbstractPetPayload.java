package org.springframework.samples.petclinic.domain.owner.graphql;

import org.springframework.samples.petclinic.domain.owner.Pet;

/**
 * @author Nils Hartmann (nils@nilshartmann.net)
 */
public class AbstractPetPayload {

    private final Pet pet;

    public AbstractPetPayload(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }
}