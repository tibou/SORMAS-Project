package de.symeda.sormas.rest;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

import de.symeda.sormas.api.FacadeProvider;
import de.symeda.sormas.api.infrastructure.InfrastructureChangeDatesDto;
import de.symeda.sormas.api.infrastructure.InfrastructureSyncDto;
import de.symeda.sormas.api.user.UserReferenceDto;

@Path("/infrastructure")
@Produces({MediaType.APPLICATION_JSON + "; charset=UTF-8"})
@RolesAllowed("USER")
public class InfrastructureResource {

	@POST @Path("/sync")
	public InfrastructureSyncDto getInfrastructureSyncData(InfrastructureChangeDatesDto changeDates) {
		return FacadeProvider.getInfrastructureFacade().getInfrastructureSyncData(changeDates);
	}
	
}