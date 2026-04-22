<?php 
class subtractOperation implements IOperation{
    public function doOperation($num1, $num2)
    {
        return $num1 - $num2;
    }
}