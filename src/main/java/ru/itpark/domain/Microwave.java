package ru.itpark.domain;

public class Microwave extends Product {
    private int volume;

    public Microwave(int id, int cost, String category, String name, int volume) {
        super(id, cost, category, name);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Microwave{" +
                "id=" + getId() +
                ", cost=" + getCost() +
                ", category='" + getCategory() + '\'' +
                ", name='" + getName() + '\'' +
                ", volume=" + volume + + '\'' +
                '}';
    }
}
