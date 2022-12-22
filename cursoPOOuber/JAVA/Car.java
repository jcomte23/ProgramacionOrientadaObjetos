package JAVA;

public class Car {
    Integer id;
    String license;
    Account driver;
    Integer passengers;

    public Car(String license,Account driver){
        this.license=license;
        this.driver=driver;
    }

    void printDataCar(){
        System.out.println("license= "+ license);
        System.out.println("driver= "+ driver.name +"/document: "+driver.document);
        System.out.println("passengers= "+ passengers+" persons");
    }
}
