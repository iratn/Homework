package Homework;

public class Truck  extends Vehicle {
    private int cargocap;

    Truck(int р, int f, int m, int c) {
        super(р, f, m);
        cargocap = c;
    }
    int getCargo() { return cargocap; }
    void putCargo (int c) { cargocap = c; }
}
