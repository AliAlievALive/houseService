package ru.itpark.comparator;

import ru.itpark.model.House;

import java.io.Serializable;
import java.util.Comparator;

import static java.lang.Math.toIntExact;

public class HouseByPriceAscComparator implements Comparator<House>, Serializable {

    @Override
    public int compare(House o1, House o2) {
        return toIntExact(o1.getPrice() - o2.getPrice());
    }
}
