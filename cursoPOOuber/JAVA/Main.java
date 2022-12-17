package JAVA;

public class main {
    public static void main(String[] args) {
        Car car=new Car("AMC-234",new Account("Andres Jimenez", "1096247379"));
        car.passengers=4;
        car.printDataCar();
    }
}
