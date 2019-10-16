package ru.itpark.service;

import ru.itpark.util.House;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HouseService {
    private List<House> houses = new ArrayList<>();

    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(ArrayList<House> houses) {
        this.houses = houses;
    }

    public void addHouse(House house) {
        houses.add(house);
    }

    public void printSortingHouse() {
        List<House> sorting = searchMinToMax();
        for (House house : sorting) {
            System.out.println(house.toString());
            System.out.println();
            System.out.println();
        }
    }

    private List<House> searchMinToMax() {
        List<House> result = houses;
        result.sort(Comparator.comparing(House::getPrice));
        return result;
    }

    public List<House> searchInArea(String area) {
        List<House> result = new ArrayList<>();
        for (House house : houses) {
            if (house.getArea().toUpperCase().contains(area.toUpperCase())) {
                result.add(house);
            }
        }
        return result;
    }
}
