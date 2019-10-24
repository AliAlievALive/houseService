package ru.itpark.model;

import java.util.List;

public class HouseHome extends House {
    private double landArea;
    private int stages;

    public HouseHome(int id, long price, double livingArea, List<String> photos, String specification,
                     String phone, String city, String area, String street, double landArea, int stages) {
        super(id, price, livingArea, photos, specification, phone, city, area, street);
        this.landArea = landArea;
        this.stages = stages;
    }

    public double getLandArea() {
        return landArea;
    }

    public void setLandArea(double landArea) {
        this.landArea = landArea;
    }

    public int getStages() {
        return stages;
    }

    public void setStages(int stages) {
        this.stages = stages;
    }

    @Override
    public String toString() {
        return super.toString() +
                "landArea=" + landArea +
                ", stages=" + stages +
                "} ";
    }
}
