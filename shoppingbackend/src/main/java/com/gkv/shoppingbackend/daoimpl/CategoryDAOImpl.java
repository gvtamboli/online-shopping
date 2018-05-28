package com.gkv.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.gkv.shoppingbackend.dao.CategoryDAO;
import com.gkv.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO{
	
	private static List<Category> listOfProducts;
	static{
		listOfProducts = new ArrayList<>();
		Category category = new Category();
		
		category.setId(1);
		category.setName("Television");
		category.setDescription("Some Description for Television");
		category.setImageURL("CAT_1.png");
		
		listOfProducts.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("Some Description for Mobile");
		category.setImageURL("CAT_2.png");
		
		listOfProducts.add(category);
		
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("Some Description for Laptop");
		category.setImageURL("CAT_3.png");
		
		listOfProducts.add(category);
	}

	@Override
	public List<Category> getList() {
		// TODO Auto-generated method stub
		return listOfProducts;
	}

}
