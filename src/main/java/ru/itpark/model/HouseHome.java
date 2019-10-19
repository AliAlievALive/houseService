package ru.itpark.model;

import java.util.List;

public class HouseHome extends House {
    private double landArea;
    private int stages;
    /*private boolean toiletInHouse;
    private boolean gas;
    private boolean communications;
    private boolean brickHouse;
    private boolean withoutIntermediaries;
    private boolean gasHeating;
    private boolean bath;*/

    /*public HouseHome(int id, long price, double livingArea, List<String> photos, String specification, String phone,
                     String city, String area, String street, double landArea, int stages, boolean toiletInHouse,
                     boolean gas, boolean communications, boolean brickHouse, boolean withoutIntermediaries,
                     boolean gasHeating, boolean bath) {
        super(id, price, livingArea, photos, specification, phone, city, area, street);
        this.landArea = landArea;
        this.stages = stages;
        this.toiletInHouse = toiletInHouse;
        this.gas = gas;
        this.communications = communications;
        this.brickHouse = brickHouse;
        this.withoutIntermediaries = withoutIntermediaries;
        this.gasHeating = gasHeating;
        this.bath = bath;
    }*/

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
