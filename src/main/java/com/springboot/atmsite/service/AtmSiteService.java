package com.springboot.atmsite.service;

import java.util.List;

import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.springboot.atmsite.customException.ResourceNotFoundException;
import com.springboot.atmsite.entity.AtmSiteEntity;
import com.springboot.atmsite.repository.IAtmSiteRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AtmSiteService {
	 private final IAtmSiteRepository iAtmSiteRepository;

	  public List<AtmSiteEntity> getAllAtmSites() {
	        return iAtmSiteRepository.findAll();
	    }

	    public AtmSiteEntity createAtmSite(AtmSiteEntity atmSite) {
	        return iAtmSiteRepository.save(atmSite);
	    }

	    public AtmSiteEntity updateAtmSite(Long id, AtmSiteEntity updatedAtmSite) {
	    	AtmSiteEntity atmSite = iAtmSiteRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ATM Site not found"));
	        atmSite.setSiteCode(updatedAtmSite.getSiteCode());
	        atmSite.setAddress(updatedAtmSite.getAddress());
	        atmSite.setStatus(updatedAtmSite.getStatus());
	        atmSite.setInstallationDate(updatedAtmSite.getInstallationDate());
	        return iAtmSiteRepository.save(atmSite);
	    }

	    public void deleteAtmSite(Long id) {
	    	iAtmSiteRepository.deleteById(id);
	    }
}
