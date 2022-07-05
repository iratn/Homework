package Homework;

public class TruckDemo {
    public static void main(String[] args) {
        Truck semi = new Truck(6, 400, 9, 55060);
        Truck pickup = new Truck(9, 50, 20, 7000);
        double gallons;
        int dist = 252;
        gallons = semi.fuelneeded(dist);
        System.out.println("Гpyзoвик может перевезти " + semi.getCargo() + " фунтов");
        System.out.println("Для преодоления " + dist + " миль грузовику требуется " + gallons + " галлонов топлива.");

        gallons= pickup.fuelneeded(dist);

        System.out.println("Пикaп может перевезти " + pickup.getCargo() + " фунтов.");
        System.out.println("Для преодоления " + dist + " миль пикапу требуется " + gallons + " галлонов топлива.");
    }
}
