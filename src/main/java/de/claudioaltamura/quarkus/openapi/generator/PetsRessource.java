package de.claudioaltamura.quarkus.openapi.generator;

import java.util.ArrayList;
import java.util.List;

import de.claudioaltamura.quarkus.openapi.generator.api.PetsApi;
import de.claudioaltamura.quarkus.openapi.generator.model.Pet;

public class PetsRessource implements PetsApi {

	@Override
	public void createPets() {

	}

	@Override
	public List<Pet> listPets(Integer limit) {
		List<Pet> pets = new ArrayList<>();
		Pet pet = new Pet();
		pet.setId(1L);
		pet.setName("Flush");
		pet.setTag("Flush");
		pets.add(pet);

		return pets;
	}

	@Override
	public Pet showPetById(String petId) {
		Pet pet = new Pet();
		pet.setId(1L);
		pet.setName("Flush");
		pet.setTag("Flush");

		return pet;
	}
}
