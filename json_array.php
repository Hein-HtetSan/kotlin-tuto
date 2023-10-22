<?php

    $con = new mysqli("localhost", "root", "ykpt22270", "company");
    $st = $con -> prepare("select * from emp");
    $st -> execute();
    $rs = $st -> get_result();
    $emps = array();
    while($row = $rs ->fetch_assoc()){
        array_push($emps, $row);
    }
    
    echo json_encode($emps);

