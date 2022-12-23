package JAVA;

public class Car {
    private Integer id;
    private String license;
    private Account driver;
    private Integer passengers;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    public Integer getPassenger() {
        return passengers;
    }

    public void setPassenger(Integer passengers) {
        if (passengers == 4) {
            this.passengers = passengers;
        } else {
            System.out.println("nesecitas asignar 4 pasajeros");
        }
    }

    void printDataCar() {
        if (passengers != null) {
            System.out.println("license= " + license);
            System.out.println("driver= " + driver.name + "/document: " + driver.document);
            System.out.println("passengers= " + passengers + " persons");
        }

    }

}
