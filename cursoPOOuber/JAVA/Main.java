package JAVA;

public class main {
    public static void main(String[] args) {
        UberX car=new UberX("AMC-234",new Account("Andres Jimenez", "1096247379"),"Audi","Z300");
        car.setPassenger(4);
        car.printDataCar();
    }
}
