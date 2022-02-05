package de.claudioaltamura.quarkus.openapi.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import de.claudioaltamura.quarkus.openapi.generator.api.PetsApi;
import de.claudioaltamura.quarkus.openapi.generator.model.Pet;

public class PetsRessource implements PetsApi {

	@Context
	private UriInfo uriInfo;

	private List<Pet> pets = new ArrayList<>();

	public PetsRessource() {
		Pet pet = new Pet();
		pet.setId(1L);
		pet.setName("Flush");
		pet.setTag("Flush");
		pets.add(pet);
	}

	@Override
	public Response createPets() {
		Pet pet = new Pet();
		long nextId = ThreadLocalRandom.current().nextLong(1000);
		pet.setId(nextId);
		pet.setName("Pet " + nextId);
		pet.setTag("Pet Tag " + nextId);
		pets.add(pet);

		UriBuilder uriBuilder = uriInfo.getAbsolutePathBuilder();
		uriBuilder.path(Long.toString(nextId));
		return Response.created(uriBuilder.build()).entity(pet).build();
	}

	@Override
	public Response listPets(Integer limit) {
		return Response.ok(pets).build();
	}

	@Override
	public Response showPetById(String petId) {
		Pet pet = new Pet();
		pet.setId(1L);
		pet.setName("Flush");
		pet.setTag("Flush");

		return Response.ok(pet).build();
	}
}
