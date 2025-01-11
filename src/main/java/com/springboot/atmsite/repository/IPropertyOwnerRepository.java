package com.springboot.atmsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.atmsite.entity.PropertyOwnerEntity;

public interface IPropertyOwnerRepository extends JpaRepository<PropertyOwnerEntity, Long> {

}
