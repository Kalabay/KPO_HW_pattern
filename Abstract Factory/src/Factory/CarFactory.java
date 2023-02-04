package Factory;

import interfaces.Sedan;
import interfaces.Coupe;

public abstract class CarFactory {
    private String name;

    public abstract Sedan makeSedan(String model);

    public abstract Coupe makeCoupe(String model);
}
