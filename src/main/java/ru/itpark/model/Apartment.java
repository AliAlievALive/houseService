package ru.itpark.model;

import ru.itpark.util.House;

import java.util.List;

public class Apartment extends House {
    private int houseStages;
    private int ApartmentStage;

    public Apartment(int id, long price, double livingArea, List<String> photos, String specification,
                     String phone, String city, String area, String street, int houseStages, int apartmentStage) {
        super(id, price, livingArea, photos, specification, phone, city, area, street);
        this.houseStages = houseStages;
        ApartmentStage = apartmentStage;
    }

    public int getHouseStages() {
        return houseStages;
    }

    public void setHouseStages(int houseStages) {
        this.houseStages = houseStages;
    }

    public int getApartmentStage() {
        return ApartmentStage;
    }

    public void setApartmentStage(int apartmentStage) {
        ApartmentStage = apartmentStage;
    }
}