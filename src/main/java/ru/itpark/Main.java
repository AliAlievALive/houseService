package ru.itpark;

import ru.itpark.model.Apartment;
import ru.itpark.model.HouseHome;
import ru.itpark.service.HouseService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> photosHouse1 = new ArrayList<String>();
        photosHouse1.add("https://");
        HouseHome house1 = new HouseHome(
                1,
                2_000_000_000,
                532.3,
                photosHouse1,
                "Уютный дом, ... ",
                "+79666-666-666",
                "Kazan",
                "Советский",
                "Проспект победы",
                1200,
                5);
        List<String> photosHouse2 = new ArrayList<String>();
        photosHouse2.add("https://");
        HouseHome house2 = new HouseHome(
                3,
                1_000_000_000,
                120.3,
                photosHouse2,
                "Good Home, ... ",
                "+79666-666-666",
                "Kazan",
                "Советский",
                "Проспект победы",
                1200,
                5);
        List<String> photosApart1 = new ArrayList<String>();
        photosApart1.add("https://");
        photosApart1.add("https://");
        Apartment apartment1 = new Apartment(
                2,
                2_000_000,
                54.,
                photosApart1,
                "Мелкая квартира",
                "+77777777777",
                "Kazan",
                "Вахитовский",
                "Бутлерова",
                7,
                4);
        List<String> photosApart2 = new ArrayList<String>();
        photosApart2.add("https://");
        photosApart2.add("https://");
        Apartment apartment2 = new Apartment(
                4,
                1_030_000,
                54.,
                photosApart2,
                "...",
                "+777777377",
                "Kazan",
                "Вахитовский",
                "Бутлерова",
                12,
                2);
        HouseService housesBase = new HouseService();
        housesBase.addHouse(house1);
        housesBase.addHouse(apartment1);
        housesBase.addHouse(apartment2);
        housesBase.addHouse(house2);
        housesBase.printSortingHouse();
    }
}
