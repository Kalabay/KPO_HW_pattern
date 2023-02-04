import Classes.*;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("1");
        Car car2 = new Car("2");
        Car car3 = new Car("3");
        Car car4 = new Car("4");

        TrafficPolicePost p1 = new TrafficPolicePost("p1");
        TrafficPolicePost p2 = new TrafficPolicePost("p2");

        car1.addObserver(p1);
        car1.addObserver(p2);
        car1.removeObserver(p2);

        car2.addObserver(p2);

        car3.addObserver(p1);
        car3.addObserver(p2);

        car4.addObserver(p1);
        car4.addObserver(p2);

        car1.notifyObserver();
        car2.notifyObserver();
        car3.notifyObserver();
        car4.notifyObserver();
    }
}