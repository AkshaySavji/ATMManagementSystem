package com.springboot.atmsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.atmsite.entity.AtmSiteEntity;

public interface IAtmSiteRepository extends JpaRepository<AtmSiteEntity, Long> {

}
