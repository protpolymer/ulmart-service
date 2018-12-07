package ru.itpark.domain;

public class Phone extends Product {
    private String color;

    public Phone(int id, int cost, String category, String name, String color) {
        super(id, cost, category, name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + getId() +
                ", cost=" + getCost() + '\'' +
                ", category='" + getCategory() + '\'' +
                ", name='" + getName() + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
