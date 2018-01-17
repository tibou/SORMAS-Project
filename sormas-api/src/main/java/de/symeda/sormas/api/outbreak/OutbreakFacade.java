package de.symeda.sormas.api.outbreak;

import java.util.Date;
import java.util.List;

import javax.ejb.Remote;

import de.symeda.sormas.api.Disease;
import de.symeda.sormas.api.region.DistrictReferenceDto;
import de.symeda.sormas.api.region.RegionReferenceDto;

@Remote
public interface OutbreakFacade {

	List<OutbreakDto> getAllAfter(Date date);
	
	List<OutbreakDto> getAllByRegionAndDisease(RegionReferenceDto region, Disease disease);

	boolean hasOutbreak(DistrictReferenceDto district, Disease disease);
}