package ru.geekbrains.lesson3;

import java.awt.*;

public class Harvester extends Car implements Fueling, Washable {


    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    private FuelType fuelType;


    private Refueling refueling;
    private Wiping wiping;


    public void setCarWash(Wiping wiping) {
        this.wiping = wiping;
    }


    public Harvester(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(6);
    }


    @Override
    public void wash() {
        System.out.println("моемся");
        if(wiping != null){
            wiping.wipHeadlights();
            wiping.wipMirrors();
            wiping.wipWindshield();
        }
    }
    public void setRefuelingStation(Refueling refuelingStation) {
        this.refueling = refuelingStation;
    }

    /**
     * Заправить автомобиль
     */
    @Override
    public void fuel() {
        System.out.println("Заправляемся");
        if (refueling != null){
            refueling.fuel(fuelType);
        }
    }

    @Override
    public void movement() {

    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadlights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }

    public void sweeping() {
        System.out.println("Автомобиль метет улицу.");
    }




}
