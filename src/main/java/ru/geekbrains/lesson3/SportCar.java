package ru.geekbrains.lesson3;

import java.awt.*;

public class SportCar extends Car implements Fueling, Washable {

    public void setRefuelingStation(Refueling refuelingStation) {
        this.refueling = refuelingStation;
    }


    public void setCarWash(Wiping wiping) {
        this.wiping = wiping;
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
    @Override
    public void fuel() {
        System.out.println("Заправляемся");
        if (refueling != null){
            refueling.fuel(fuelType);
        }
    }

    private FuelType fuelType;


    private Refueling refueling;
    private Wiping wiping;


    public SportCar(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(3);
    }
    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }
    public FuelType getFuelType() {
        return fuelType;
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


}
