package com.example.buysell.services;

import com.example.buysell.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID = 0;

    {
        products.add(new Product(++ID, "Краска для волос", "Различные цвета", 670, "Krasnoyarsk", "Тихон"));
        products.add(new Product(++ID, "Бензопила", "Цепная", 24000, "Moscow", "Игорь"));
        products.add(new Product(++ID, "Сапоги", "описание сапогов", 2400, "Moscow", "Ирина"));
        products.add(new Product(++ID, "Качели", "Детские до 30кг", 5800, "Ярославль", "Семен"));
    }

    public List<Product> listProducts() { return products; }

    public void saveProduct(Product product) {
        product.setId(++ID);
        products.add(product);
    }

    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }

    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) return product;
        }
        return null;
    }
}
