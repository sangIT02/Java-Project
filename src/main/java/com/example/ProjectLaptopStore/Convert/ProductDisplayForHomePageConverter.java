package com.example.ProjectLaptopStore.Convert;

import com.example.ProjectLaptopStore.DTO.Product_DisplayForHomePageDTO;
import com.example.ProjectLaptopStore.Entity.ProductsEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductDisplayForHomePageConverter {
    @Autowired
    private ModelMapper modelMapper;

    public Product_DisplayForHomePageDTO toDisplayHomePage(ProductsEntity productsEntity) {
        Product_DisplayForHomePageDTO productDisplayForHomePageDTO = modelMapper.map(productsEntity, Product_DisplayForHomePageDTO.class);
        productDisplayForHomePageDTO.setProductName(productsEntity.getProductName());
        productDisplayForHomePageDTO.setProductPrice(productsEntity.getPrice());
        productDisplayForHomePageDTO.setImageURL(productsEntity.getImageURL());
        return productDisplayForHomePageDTO;
    }
}
