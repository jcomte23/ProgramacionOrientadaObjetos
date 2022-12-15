from car import Car

if __name__ == "__main__":
    car=Car()
    car.license="AMC-234"
    car.driver="Andres Jimenez"
    car.passengers=4
    print(vars(car))