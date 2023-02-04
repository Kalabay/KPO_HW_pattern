package Classes;

import interfaces.Observer;

public class TrafficPolicePost implements Observer {
    @Override
    public void handleEvent(String information) {
        System.out.println("Information for " + name + ": " + information + " ACCEPTED");
    }

    public TrafficPolicePost(String name) {
        this.name = name;
    }

    private String name;
}
