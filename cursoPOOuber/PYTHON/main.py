from car import Car
from UberX import Uberx
from account import Account

if __name__ == "__main__":
    uber1=Uberx("AW456",Account("Andres Herrera", "10928378443"),"chevolet","Spark")
    print(vars(uber1))
    print(vars(uber1.driver))