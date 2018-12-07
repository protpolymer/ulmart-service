package ru.itpark.repository;

import ru.itpark.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class UlmartRepository {
    private List<Product> items = new ArrayList<Product>();

    public void add(Product product){
        items.add(product);
    }

    public List<Product> getAll(){
        return items;
    }
}
