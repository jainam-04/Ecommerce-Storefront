package com.app.config;

import com.app.models.Category;
import com.app.models.Product;
import com.app.repositories.CategoryRepository;
import com.app.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        productRepository.deleteAll();
        categoryRepository.deleteAll();

        Category electronics = new Category();
        electronics.setName("Electronics");

        Category clothing = new Category();
        clothing.setName("Clothing");

        Category homeAndKitchen = new Category();
        homeAndKitchen.setName("Home and Kitchen");

        categoryRepository.saveAll(Arrays.asList(electronics, clothing, homeAndKitchen));

        Product phone = new Product();
        phone.setName("Smartphone");
        phone.setDescription("Latest smartphone with amazing features");
        phone.setImageUrl("https://placehold.co/600x400");
        phone.setPrice(1299.99);
        phone.setCategory(electronics);

        Product laptop = new Product();
        laptop.setName("Laptop");
        laptop.setDescription("High performance laptop for work and play");
        laptop.setImageUrl("https://placehold.co/600x400");
        laptop.setPrice(62999.99);
        laptop.setCategory(electronics);

        Product jacket = new Product();
        jacket.setName("Winter Jacket");
        jacket.setDescription("Warm and cozy jacket for winter");
        jacket.setImageUrl("https://placehold.co/600x400");
        jacket.setPrice(159.99);
        jacket.setCategory(clothing);

        Product blender = new Product();
        blender.setName("Blender");
        blender.setDescription("High speed blender for smoothies and more");
        blender.setImageUrl("https://placehold.co/600x400");
        blender.setPrice(99.99);
        blender.setCategory(homeAndKitchen);

        productRepository.saveAll(Arrays.asList(phone, laptop, jacket, blender));
    }
}
