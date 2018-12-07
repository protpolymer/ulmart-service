package ru.itpark.comparator;

import ru.itpark.domain.Product;

import java.util.Comparator;

public class CostAscComparator implements Comparator<Product> {
    public int compare(Product o1, Product o2) {
        return o1.getCost()-o2.getCost();
    }
}
