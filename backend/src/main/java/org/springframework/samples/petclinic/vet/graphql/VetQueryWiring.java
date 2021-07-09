package org.springframework.samples.petclinic.vet.graphql;

import graphql.schema.idl.RuntimeWiring;
import org.springframework.graphql.boot.RuntimeWiringBuilderCustomizer;
import org.springframework.samples.petclinic.vet.SpecialtyRepository;
import org.springframework.samples.petclinic.vet.VetRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Resolver for PetClinic Vet Queries
 *
 * @author Nils Hartmann (nils@nilshartmann.net)
 */
@Component
public class VetQueryWiring implements RuntimeWiringBuilderCustomizer {
    private final VetRepository vetRepository;
    private final SpecialtyRepository specialtyRepository;

    public VetQueryWiring(VetRepository vetRepository, SpecialtyRepository specialtyRepository) {
        this.vetRepository = vetRepository;
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public void customize(RuntimeWiring.Builder builder) {
        builder.type("Query", wiring -> wiring
            .dataFetcher("vets", env -> List.copyOf(vetRepository.findAll()))
            .dataFetcher("vet", env -> {
                int id = env.getArgument("id");
                return vetRepository.findById(id);
            })
            .dataFetcher("specialties", env -> List.copyOf(specialtyRepository.findAll()))
        );
    }
}
