package ru.itpark.service;

import ru.itpark.model.House;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HouseService {
    private List<House> houses = new ArrayList<>();
    private int indexOfNextMin;
    private int[] minToMax = minToMaxPriceId();

    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(ArrayList<House> houses) {
        this.houses = houses;
    }

    public void addHouse(House house) {
        houses.add(house);
        minToMax = minToMaxPriceId();
    }

    private int[] minToMaxPriceId() {
        List<House> result = houses;
        int[] ids = new int[result.size()];
        result.sort(Comparator.comparing(House::getPrice));
        int i = 0;
        for (House house : result) {
            ids[i++] = house.getId();
        }
        indexOfNextMin = 0;
        return ids;
    }

    public House searchMinToMaxProcess() {
        if (indexOfNextMin < 0 || indexOfNextMin > houses.size() - 1) {
            return null;
        }
        for (House house : houses) {
            if (house.getId() == minToMax[indexOfNextMin]) {
                indexOfNextMin++;
                return house;
            }
        }
        return null;
    }

    public String searchMinToMax() {
        House house = searchMinToMaxProcess();
        if (house != null) {
            return house.toString();
        } else {
            return "don't finded";
        }
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
