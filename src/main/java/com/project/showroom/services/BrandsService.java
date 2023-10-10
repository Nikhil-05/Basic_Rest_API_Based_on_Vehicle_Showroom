package com.project.showroom.services;

import java.util.List;

import com.project.showroom.hibernate.DAO.BrandsDAO;
import com.project.showroom.hibernate.entities.BrandEntity;

public class BrandsService {

	BrandsDAO DAO = new BrandsDAO();
	
	public List<BrandEntity> getBrands() {
		List<BrandEntity> list = DAO.getBrands();
		return list;
	}

	public void addBrand(BrandEntity brand) {
		DAO.addBrand(brand);
		
	}

	public void updateBrand(BrandEntity updatedBrand) {
		DAO.updateBrand(updatedBrand);
		
	}

	public void deleteBrand(int brandId) {
		DAO.deleteBrand(brandId);
		
	}

}
