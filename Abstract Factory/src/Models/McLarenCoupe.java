package Models;

import interfaces.Coupe;

public class McLarenCoupe implements Coupe {
    private String name;
    private int speed;

    public McLarenCoupe(String name, int speed) {
        this.name = name;
        this.speed = (int) (speed + Math.random() * 10);
    }

    @Override
    public void info() {
        System.out.println(name + " " + speed + " kph");
    }
}
