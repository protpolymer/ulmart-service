package ru.itpark.domain;

public class Laptop extends PC {
    private String model;
    private String display;
    private boolean wifi;
    private boolean bt;
    private String color;

    public Laptop(int id, int cost, String category, String name, String model, String display, int amountROM, int amountRAM, String cpu, String videoCP, String operationSystem, boolean wifi, boolean bt, String color) {
        super(id, cost, category, name, cpu, amountROM, amountRAM, videoCP, operationSystem);
        this.model = model;
        this.display = display;
        this.wifi = wifi;
        this.bt = bt;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isBt() {
        return bt;
    }

    public void setBt(boolean bt) {
        this.bt = bt;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + getId() +
                ", cost=" + getCost() +
                ", category='" + getCategory() + '\'' +
                ", name='" + getName() + '\'' +
                ", cpu='" + getCpu() + '\'' +
                ", amountROM=" + getAmountROM() +
                ", amountRAM=" + getAmountRAM() +
                ", videoCP='" + getVideoCP() + '\'' +
                ", operationSystem='" + getOperationSystem() + '\'' +
                ", model='" + model + '\'' +
                ", display='" + display + '\'' +
                ", wifi=" + wifi +
                ", bt=" + bt +
                ", color='" + color + '\'' +
                '}';
    }
}
