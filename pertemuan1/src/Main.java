//Muhammad Haidar Ramzy - L0125109

class Vehicle {
    String name;
    int wheelcount;
    float normalprice;
    float power;

Vehicle(String name, int wheelcount, float normalprice, int power){ 
        this.name = name;
        this.wheelcount = wheelcount;
        this.normalprice = normalprice;
        this.power = power;
    }
Vehicle(String name){
    this.name = name;
    this .wheelcount = 4;
    this.normalprice = 0;
    this.power = 0;
}
}


public class Main {
    public static void main(String[] args) {
        Vehicle esemkareborn = new Vehicle("Esemka Reborn GT-R Liberty Walk RWB", 3, 19000000, 2500);
        Vehicle shogunRWB = new Vehicle("Shogun RWB", 2, 15000, 2000);
        Vehicle yarisGR = new Vehicle("Yaris GR");
        Vehicle cc206 = new Vehicle("CC206", 12,99999, 2500);

        System.out.println("\nSetelah after");
        System.out.println(esemkareborn.name + "uwala");
        System.out.println(esemkareborn.wheelcount);
        System.out.println(esemkareborn.normalprice);

        System.out.println("\nSetelah after");
        System.out.println(shogunRWB.name);
        System.out.println(shogunRWB.wheelcount);
        System.out.println(shogunRWB.normalprice);
        System.out.println(shogunRWB.power + " Hp");

        System.out.println("\nStututututu");
        System.out.println(yarisGR.name);
        System.out.println(yarisGR.wheelcount);
        System.out.println(yarisGR.normalprice);
        System.out.println(yarisGR.power);

        System.out.println("\nPuongsssss");
        System.out.println(cc206.name);
        System.out.println(cc206.wheelcount);
        System.out.println(cc206.normalprice);
        System.out.println(cc206.power + " Hp");
    }
}
