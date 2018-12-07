package ru.itpark.domain;

public class Smartphone extends Phone {
    private String cpu;
    private int amountROM;
    private int amountRAM;
    private boolean lte;
    private double cameraMatrix;

    public Smartphone(int id, int cost, String category, String name, String cpu, int amountROM, int amountRAM, boolean lte, double cameraMatrix,  String color) {
        super(id, cost, category, name, color);
        this.cpu = cpu;
        this.amountROM = amountROM;
        this.amountRAM = amountRAM;
        this.lte = lte;
        this.cameraMatrix = cameraMatrix;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getAmountROM() {
        return amountROM;
    }

    public void setAmountROM(int amountROM) {
        this.amountROM = amountROM;
    }

    public int getAmountRAM() {
        return amountRAM;
    }

    public void setAmountRAM(int amountRAM) {
        this.amountRAM = amountRAM;
    }

    public boolean isLte() {
        return lte;
    }

    public void setLte(boolean lte) {
        this.lte = lte;
    }

    public double getCameraMatrix() {
        return cameraMatrix;
    }

    public void setCameraMatrix(double cameraMatrix) {
        this.cameraMatrix = cameraMatrix;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "id=" + getId() +
                ", cost=" + getCost() + '\'' +
                ", category='" + getCategory() + '\'' +
                ", name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", cpu='" + cpu + '\'' +
                ", amountROM=" + amountROM +
                ", amountRAM=" + amountRAM +
                ", lte=" + lte +
                ", cameraMatrix=" + cameraMatrix +
                '}';
    }
}
