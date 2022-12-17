from car import Car
from account import Account

if __name__ == "__main__":
    car=Car("AMC-234",Account("Andres Jimenez","190834235"))
    car.passengers=4
    print(vars(car))
    print(vars(car.driver))