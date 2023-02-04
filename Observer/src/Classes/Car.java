package Classes;

import interfaces.Observable;
import interfaces.Observer;
import java.util.ArrayList;

public class Car implements Observable {
    @Override
    public void addObserver(Observer post) {
        posts.add(post);
    }

    @Override
    public void removeObserver(Observer post) {
        posts.remove(post);
    }

    @Override
    public void notifyObserver() {
        if (speed > 60) {
            for (int i = 0; i < posts.size(); ++i) {
                posts.get(i).handleEvent(name);
            }
        }
    }

    public Car(String name) {
        this.name = name;
        posts = new ArrayList<>();
        speed = (int)(Math.random() * 100);
    }

    private String name;
    private int speed;
    private ArrayList<Observer> posts;
}
