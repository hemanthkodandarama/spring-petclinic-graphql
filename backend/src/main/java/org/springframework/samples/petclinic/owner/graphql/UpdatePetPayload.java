package org.springframework.samples.petclinic.owner.graphql;

import org.springframework.samples.petclinic.owner.Pet;

/**
 * @author Nils Hartmann (nils@nilshartmann.net)
 */
public class UpdatePetPayload extends AbstractPetPayload {
    public UpdatePetPayload(Pet pet) {
        super(pet);
    }
}