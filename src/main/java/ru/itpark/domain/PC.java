package ru.itpark.domain;

public class PC extends Product {
    private String cpu;
    private int amountROM;
    private int amountRAM;
    private String videoCP;
    private String operationSystem;

    public PC(int id, int cost, String category, String name, String cpu, int amountROM, int amountRAM, String videoCP, String operationSystem) {
        super(id, cost, category, name);
        this.cpu = cpu;
        this.amountROM = amountROM;
        this.amountRAM = amountRAM;
        this.videoCP = videoCP;
        this.operationSystem = operationSystem;
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

    public String getVideoCP() {
        return videoCP;
    }

    public void setVideoCP(String videoCP) {
        this.videoCP = videoCP;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public String toString() {
        return "PC{" +
                "id=" + getId() +
                ", cost=" + getCost() +
                ", category='" + getCategory() + '\'' +
                ", name='" + getName() + '\'' +
                ", cpu='" + cpu + '\'' +
                ", amountROM=" + amountROM +
                ", amountRAM=" + amountRAM +
                ", videoCP='" + videoCP + '\'' +
                ", operationSystem='" + operationSystem + '\'' +
                '}';
    }
}
