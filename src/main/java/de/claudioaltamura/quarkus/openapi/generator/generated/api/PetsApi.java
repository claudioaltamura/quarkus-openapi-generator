package de.claudioaltamura.quarkus.openapi.generator.generated.api;

import de.claudioaltamura.quarkus.openapi.generator.generated.model.Error;
import de.claudioaltamura.quarkus.openapi.generator.generated.model.Pet;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/pets")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")public interface PetsApi {

    @POST
    @Produces({ "application/json" })
    Response createPets();

    @GET
    @Produces({ "application/json" })
    Response listPets(@QueryParam("limit")    Integer limit);

    @GET
    @Path("/{petId}")
    @Produces({ "application/json" })
    Response showPetById(@PathParam("petId") String petId);
}
