package com.springboot.atmsite.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.atmsite.entity.AtmSiteEntity;
import com.springboot.atmsite.service.AtmSiteService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/atm-sites")
@RequiredArgsConstructor
public class AtmSiteManagementController {

	 private final AtmSiteService atmSiteManagementService;
	 
	 	@GetMapping
	    public List<AtmSiteEntity> getAllAtmSites() {
	        return atmSiteManagementService.getAllAtmSites();
	    }

	    @PostMapping
	    public AtmSiteEntity createAtmSite(@RequestBody AtmSiteEntity atmSite) {
	    	System.out.println("atmSite: "+atmSite);
	        return atmSiteManagementService.createAtmSite(atmSite);
	    }

	    @PutMapping("/{id}")
	    public AtmSiteEntity updateAtmSite(@PathVariable Long id, @RequestBody AtmSiteEntity updatedAtmSite) {
	        return atmSiteManagementService.updateAtmSite(id, updatedAtmSite);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteAtmSite(@PathVariable Long id) {
	    	atmSiteManagementService.deleteAtmSite(id);
	    }

}
