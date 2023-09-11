package ru.geekbrains.lesson3;

public class CarWash implements Wiping{
    @Override
    public void wipMirrors() {
        System.out.println("Трем зеркала");
    }

    @Override
    public void wipWindshield() {
        System.out.println("Трем стекло");

    }

    @Override
    public void wipHeadlights() {
        System.out.println("Трем фары");

    }
}
