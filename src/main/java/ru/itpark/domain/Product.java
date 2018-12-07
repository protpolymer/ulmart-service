package ru.itpark.domain;

public class Product {
    private int id;
    private int cost;
    private String category;
    private String name;

    public Product(int id, int cost, String category, String name) {
        this.id = id;
        this.cost = cost;
        this.category = category;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", cost=" + cost +
                ", category='" + category + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
