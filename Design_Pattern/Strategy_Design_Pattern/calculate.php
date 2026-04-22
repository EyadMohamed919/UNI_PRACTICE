<?php 
require_once __DIR__ . "/IOperation.php";
class calculate{
    private IOperation $operation;
    
    
	public function getOperation() {
		return $this->operation;
	}

	public function setOperation($value) {
		$this->operation = $value;
	}

    public function execute($num1, $num2)
    {
        return $this->operation->doOperation($num1, $num2);
    }
}