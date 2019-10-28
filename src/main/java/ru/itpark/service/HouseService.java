package ru.itpark.service;

import ru.itpark.comparator.HouseByPriceAscComparator;
import ru.itpark.model.House;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HouseService {
    List<House> searchResult;

    private List<House> houses = new ArrayList<>();

    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(ArrayList<House> houses) {
        if (houses == null) {
            throw new IllegalArgumentException("объектов нет");
        }
        this.houses = houses;
    }

    public void addHouse(House house) {
        houses.add(house);
    }

    public void setSearchResult(List<House> searchResult) {
        this.searchResult = searchResult;
    }

    public List<House> searchInPrice(long price) {
        List<House> result = new ArrayList<>();
        for (House house : houses) {
            if (house.getPrice() <= price) {
                result.add(house);
            }
        }
        Comparator<House> comparator = new HouseByPriceAscComparator();
        result.sort(comparator);
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
