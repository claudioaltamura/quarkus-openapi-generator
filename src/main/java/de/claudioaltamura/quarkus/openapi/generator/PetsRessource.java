package de.claudioaltamura.quarkus.openapi.generator;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;

import de.claudioaltamura.quarkus.openapi.generator.generated.api.PetsApi;
import de.claudioaltamura.quarkus.openapi.generator.generated.model.Pet;

public class PetsRessource implements PetsApi {

	@Override
	public Response createPets() {
		return null;
	}

	@Override
	public Response listPets(Integer limit) {
		List<Pet> pets = new ArrayList<>();
		Pet pet = new Pet();
		pet.setId(1L);
		pet.setName("Flush");
		pet.setTag("Flush");
		pets.add(pet);

		return Response.ok().entity(pets).build();
	}

	@Override
	public Response showPetById(String petId) {
		Pet pet = new Pet();
		pet.setId(1L);
		pet.setName("Flush");
		pet.setTag("Flush");

		return Response.ok().entity(pet).build();
	}
}
