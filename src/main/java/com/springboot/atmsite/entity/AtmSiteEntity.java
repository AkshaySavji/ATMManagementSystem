package com.springboot.atmsite.entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AtmSiteEntity {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(nullable = false, unique = true)
	    private String siteCode;

	    @Column(nullable = false)
	    private String address;

	    @Enumerated(EnumType.STRING)
	    private Status status;

	    private LocalDate installationDate;

	    @ManyToOne
	    @JoinColumn(name = "property_owner_id", nullable = false)
	    private PropertyOwnerEntity propertyOwnerEntity;

	    @OneToOne(mappedBy = "atmSite", cascade = CascadeType.ALL)
	    private LeaseAgreementEntity leaseAgreement;

	    public enum Status {
	        ACTIVE, INACTIVE, UNDER_MAINTENANCE
	    }
}
