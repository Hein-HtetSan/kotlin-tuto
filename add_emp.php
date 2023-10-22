<?php

    $con = new mysqli("localhost", "root", "ykpt22270", "company");
    $st = $con -> prepare("insert into emp values (?,?,?)"); // skull statement
    $st -> bind_param("isi", $_GET["id"], $_GET["name"], $_GET["salary"]); // isi => integer, string, integer
    $st -> execute();
            
            

