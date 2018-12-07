package ru.itpark.domain;

public class Crockpot extends Microwave {
    private int power;
    private String color;

    public Crockpot(int id, int cost, String category, String name, int volume, int power, String color) {
        super(id, cost, category, name, volume);
        this.power = power;
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Crockpot{" +
                "id=" + getId() +
                ", cost=" + getCost() +
                ", category='" + getCategory() + '\'' +
                ", name='" + getName() + '\'' +
                ", volume=" + getVolume() + + '\'' +
                ", power=" + power + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
