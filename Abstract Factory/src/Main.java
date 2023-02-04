import Factory.*;

public class Main {
    public static void main(String[] args) {
        MercedesFactory mercedes = new MercedesFactory();
        McLarenFactory mclaren = new McLarenFactory();
        var car1 = mclaren.makeCoupe("C1");
        var car2 = mclaren.makeSedan("S1");

        var car3 = mercedes.makeSedan("E-Class");
        var car4 = mercedes.makeSedan("C-Class");
        var car5 = mercedes.makeCoupe("Coupe-Class");

        car1.info();
        car2.info();
        car3.info();
        car4.info();
        car5.info();
    }
}