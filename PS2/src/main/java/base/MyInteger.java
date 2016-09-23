package base;

import base.MyInteger;

public class MyInteger{
	private int iValue;  //Creates variable

	public MyInteger(int iValue) {	//Creates constructor
		this.iValue = iValue;
	}

	public int getiValue() {		//get method
		return iValue;
	}

	public boolean isEven() {		//Boolean whether number is even or not 
		return isEven(iValue);		//Calls the static method below
	}

	public boolean isOdd() {		//Boolean whether number is odd or not 
		return isOdd(iValue);		//Calls the static method below
	}

	public boolean isPrime() {		//Boolean whether number is prime or not 
		return isPrime(iValue);		//Calls the static method below
	}

	public static boolean isEven(int iValue) {	//Boolean whether number is even or not 
		if (iValue % 2 == 0) {
			return true;
		}
		return false;
	}

	public static boolean isOdd(int iValue) {	//Boolean whether number is odd or not 
		if (iValue % 2 == 1) {
			return true;
		}
		return false;
	}

	public static boolean isPrime(int iValue){	//Boolean whether number is prime or not
		for (int d=2; d<iValue; d++){
			if (iValue % d == 0)
				return false;
		}
		return true;
	}

	public static boolean isPrime(MyInteger q){		//Returns a boolean for the object 'MyInteger'; Prime
		return q.isPrime(q.getiValue());

	}
	
	public static boolean isEven(MyInteger q){		//Returns a boolean for the object 'MyInteger'; Even
		return q.isEven(q.getiValue());
	}
	
	public static boolean isOdd(MyInteger q){		//Returns a boolean for the object 'MyInteger'; Odd
		return q.isOdd(q.getiValue());

	}
	
	public boolean equals(int q){		//Returns a boolean to check if the value in the object equals specified value
		return (q == iValue);
	}
	
	public boolean equals(MyInteger q){		//Returns a boolean to check if the value in the object equals specified value
		return equals(q.getiValue());
	}
}