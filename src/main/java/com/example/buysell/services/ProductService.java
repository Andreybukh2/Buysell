package com.example.buysell.services;

import com.example.buysell.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> productsDB = new ArrayList<>();
    private long ID = 0;

    {
        productsDB.add(new Product(++ID, "Краска для волос", "Различные цвета", 670, "Krasnoyarsk", "Тихон", "Что то дополнительное"));
        productsDB.add(new Product(++ID, "Бензопила", "Цепная", 24000, "Moscow", "Игорь","Что то дополнительное"));
        productsDB.add(new Product(++ID, "Сапоги", "описание сапогов", 2400, "Moscow", "Ирина","Что то дополнительное"));
        productsDB.add(new Product(++ID, "Качели", "Детские до 30кг", 5800, "Ярославль", "Семен","Что то дополнительное"));
    }

    public List<Product> listProductsDB () { return productsDB; }

    public void saveProduct(Product product) {
        product.setId(++ID);
        productsDB.add(product);
    }

    public void deleteProduct(Long id) {
        productsDB.removeIf(product -> product.getId().equals(id));
    }

    public Product getProductFromDBById(Long id) {
        for (Product product : productsDB) {
            if (product.getId().equals(id)) return product;
        }
        return null;
    }
}
