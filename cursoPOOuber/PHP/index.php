<?php

require_once('Account.php');
require_once('Car.php');

$car = new Car("AW456", new Account("Andres Herrera", "10928378443"));
$car->printDataCar();
