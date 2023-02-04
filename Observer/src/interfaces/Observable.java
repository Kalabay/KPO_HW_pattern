package interfaces;

public interface Observable {
    void addObserver(Observer a);

    void removeObserver(Observer a);

    void notifyObserver();
}
