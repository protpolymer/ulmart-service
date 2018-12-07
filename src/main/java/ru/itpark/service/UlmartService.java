package ru.itpark.service;

import ru.itpark.domain.Product;
import ru.itpark.repository.UlmartRepository;

import java.util.Comparator;
import java.util.List;

public class UlmartService {
    private UlmartRepository repository;

    public UlmartService(UlmartRepository repository) {
        this.repository = repository;
    }
    public void add(Product product){
        repository.add(product);
    }

    public List<Product> getAll(){
        return repository.getAll();
    }
    public UlmartService getFilterCategory(String category){
        UlmartService result = new UlmartService(new UlmartRepository());
        for (Product product : repository.getAll()) {
            if(product.getCategory().equalsIgnoreCase(category)){
                result.add(product);
            }
        }
        return result;
    }
    public List<Product> getSorted (Comparator comparator){
        List<Product> result = repository.getAll();
        result.sort(comparator);
        return result;
    }
}
