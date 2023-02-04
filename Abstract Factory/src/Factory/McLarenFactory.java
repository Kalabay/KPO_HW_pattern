package Factory;

import Models.McLarenCoupe;
import Models.McLarenSedan;
import interfaces.Sedan;
import interfaces.Coupe;

public class McLarenFactory extends CarFactory {
    private String name;

    public McLarenFactory() {
        this.name = "McLaren";
    }

    @Override
    public Sedan makeSedan(String model) {
        return new McLarenSedan(name + " " + model, 112);
    }

    @Override
    public Coupe makeCoupe(String model) {
        return new McLarenCoupe(name + " " + model, 127);
    }
}
