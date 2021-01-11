package org.springframework.samples.petclinic.owner.graphql;

import org.springframework.samples.petclinic.owner.Pet;

/**
 * @author Nils Hartmann (nils@nilshartmann.net)
 */
public class AddPetPayload extends AbstractPetPayload {

    public AddPetPayload(Pet pet) {
        super(pet);
    }
}