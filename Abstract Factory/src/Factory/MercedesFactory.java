package Factory;

import Models.McLarenCoupe;
import Models.McLarenSedan;
import interfaces.Coupe;
import interfaces.Sedan;

public class MercedesFactory extends CarFactory {
    private String name;

    public MercedesFactory() {
        this.name = "Mercedes";
    }

    @Override
    public Sedan makeSedan(String model) {
        return new McLarenSedan(name + " " + model, 119);
    }

    @Override
    public Coupe makeCoupe(String model) {
        return new McLarenCoupe(name + " " + model, 123);
    }
}
