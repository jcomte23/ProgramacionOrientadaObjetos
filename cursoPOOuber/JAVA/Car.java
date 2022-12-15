package JAVA;

public class Car {
    Integer id;
    String license;
    String driver;
    Integer passengers;

    void printDataCar(){
        System.out.println("license= "+ license);
        System.out.println("driver= "+ driver);
        System.out.println("passengers= "+ passengers+" persons");
    }
}
