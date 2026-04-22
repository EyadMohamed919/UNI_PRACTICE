<?php 
class multiplyOperation implements IOperation{
    public function doOperation($num1, $num2)
    {
        return $num1 * $num2;
    }
}