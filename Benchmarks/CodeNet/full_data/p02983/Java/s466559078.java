<?php
    fscanf(STDIN, '%d %d', $left, $right);

    if(floor($left / 2019) != floor($right / 2019)){
        $ans = 0;
    }else{
        $left %= 2019;
        $ans = $left * ($left + 1) % 2019;
    }
    echo $ans;