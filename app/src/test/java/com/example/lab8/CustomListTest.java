package com.example.lab8;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    public CustomList MockCityList() {
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest() {
        list = MockCityList();
        int size = list.getCount();
        list.addCity(new City("Fort Knox", "Washington"));
        assertEquals(list.getCount(), size + 1);
    }


    @Test
    public void hasCityTest(){
        list = MockCityList();
        City testCity = new City("Markham",  "Ontario");
        list.addCity(testCity);
        Assertions.assertTrue(list.hasCity(testCity));
    }

    @Test
    public void countCitiesTest() {
        list = MockCityList();
        list.addCity(new City("Edmonton", "Alberta"));
        list.addCity(new City("Calgary", "Alberta"));
        assertEquals(2, list.getCount());
    }

    @Test
    public void deleteCityTest() {
        list = MockCityList();
        City testCity = new City("Toronto", "Ontario");
        list.addCity(testCity);
        list.addCity(new City("Ottawa", "Ontario"));
        int listSize = list.getCount();

        list.deleteCity(testCity);
        assertEquals(list.getCount(), listSize - 1);
    }

}
