<?php
require_once __DIR__ . "/IOperation";
class addOperation implements IOperation{
    public function doOperation($num1, $num2)
    {
        return $num1 + $num2;
    }
}