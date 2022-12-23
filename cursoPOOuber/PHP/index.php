<?php

require_once('Account.php');
require_once('Car.php');
require_once('uberX.php');
require_once('uberPool.php');

$UBERX=new UberX("AW456", new Account("Andres Herrera", "10928378443"),"chevolet","Spark");

$UBERPOOL=new UberPool("XBD343", new Account("Mario matinez", "10989344"),"chevolet","Spark");
$UBERX->PrintDataCar();
$UBERPOOL->PrintDataCar();


