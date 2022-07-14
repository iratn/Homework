package Homework;

import java.util.Scanner;
class Main{
public static class Phone {
    public int number;
    public String model;
    public int weight;

    String name = "Marry";
    public void receiveCall(){
        System.out.println("Calling " + name);
    }
    public void receiveCall(String name, int num) {
        System.out.println("Calling " + name + "\n" + num);
    }
    public void getNumber(){
        System.out.println(number);
    }
    public void sendMessage(int num1, int num2){
        System.out.println(num1 + num2);
    }
    public Phone(int a, String b, int c){
        number = a;
        model = b;
        weight = c;
        Phone ph = new Phone(1, "model");
    }
    public Phone(int a, String b){
        number = a;
        model = b;
    }
    public Phone(){}
}
static int getNum(){
    Scanner num = new Scanner(System.in);
    return num.nextInt();
}
    static String getStr() {

        Scanner str = new Scanner(System.in);

        return str.nextLine();

    }

    public static void main(String [ ] args) {

        Phone ph1 = new Phone();

        Phone ph2 = new Phone();

        Phone ph3 = new Phone();

        Phone ph = new Phone();

        System.out.print("Enter 1st phone number: ");

        ph1.number = getNum();

        System.out.print("Enter the model : ");

        ph1.model = getStr();

        System.out.print("Weight: ");

        ph1.weight = getNum();

        System.out.print("Enter 2nd phone number: ");

        ph2.number = getNum();

        System.out.print("Enter the model : ");

        ph2.model = getStr();

        System.out.print("Weight : ");

        ph2.weight = getNum();

        System.out.print("Enter 3rd phone number : ");

        ph3.number = getNum();

        System.out.print("Enter the model : ");

        ph3.model = getStr();

        System.out.print("Weight: ");

        ph3.weight = getNum();

        System.out.println(ph1.number + " " + ph1.model + " " + ph1.weight);

        System.out.println(ph2.number + " " + ph2.model + " " + ph2.weight);

        System.out.println(ph3.number + " " + ph3.model + " " + ph3.weight);

        System.out.println();

        ph1.receiveCall();

        ph1.getNumber();

        System.out.println();

        ph2.receiveCall();

        ph2.getNumber();

        System.out.println();

        ph3.receiveCall();

        ph3.getNumber();

        ph1 = new Phone(ph1.number, ph1.model, ph1.weight);

        ph2 = new Phone(ph2.number, ph2.model);

        ph.receiveCall(ph1.name, ph2.number);

        ph.sendMessage(ph1.number, ph2.number);

    }

}

