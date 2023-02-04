package Models;

import interfaces.Sedan;

public class McLarenSedan implements Sedan {
    private String name;
    private int speed;

    public McLarenSedan(String name, int speed) {
        this.name = name;
        this.speed = (int) (speed + Math.random() * 10);;
    }

    @Override
    public void info() {
        System.out.println(name + " " + speed + " kph");
    }
}
