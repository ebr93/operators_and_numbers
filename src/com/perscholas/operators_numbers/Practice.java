package com.perscholas.operators_numbers;

public class Practice {
	
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intToBinaryLeft(2);
		intToBinaryLeft(9);
		intToBinaryLeft(17);
		intToBinaryLeft(88);

		intToBinaryRight(150);
		intToBinaryRight(225);
		intToBinaryRight(1555);
		intToBinaryRight(32456);
		
		bitwiseOperators();
		
		bitwiseOperator();
		
		postfixOperator();
		
		incrementsOfVariable();
		
		sumOperators();
	}
	*/
	
	public void intToBinaryLeft(int n) {
		int x = n;
		System.out.println("Decimal: " + x);
		System.out.println("Binary: " + Integer.toBinaryString(x));
		// shifts bits by a given number to the left, adding bits, making them bigger
		x = n << 1;
		System.out.println("Decimal Shifted: " + x);
		System.out.println("Binary Shifted: " + Integer.toBinaryString(x) + "\n");
	}
	
	public void intToBinaryRight(int n) {
		int x = n;
		System.out.println("Decimal: " + x);
		System.out.println("Binary: " + Integer.toBinaryString(x));
		// shifts bits by a given number to the right, losing bits, making them smaller
		x = n >> 2;
		System.out.println("Decimal Shifted: " + x);
		System.out.println("Binary Shifted: " + Integer.toBinaryString(x) + "\n");
	}

	//	test & and | bitwise operators
	public void bitwiseOperators() {
		int x, y, z;
		x = 7;
		y = 17;
		
		z = x & y;
		System.out.println(z);
		System.out.println(Integer.toBinaryString(x&y));
		System.out.println(x&y);
		System.out.println();
		
		z = x | y;
		System.out.println(z);
		System.out.println(Integer.toBinaryString(x | y));
		System.out.println((x|y) + "\n");

	}
	
	// personal testing
	public void bitwiseOperator() {
		int x, y, z;
		x = 7;
		y = 17;
		
		// << bitwise will increase value of the number, also shifts bits to the left. Increases the number by multiplying by 2 for each iteration
		// >> will decrease value of the number, shifts bits to the right. Decreases the number by dividing the number by 2 for each iteration
		z = x << y;
		// left shift
		System.out.println(z);
		System.out.println(Integer.toBinaryString(z));
		
		z = y << x;
		// left shift x amount of times, y is multiplied by 2 7 amount of times in this case
		System.out.println(z);
		System.out.println(Integer.toBinaryString(z));
		
		// should be a value of 0, does not go into negative numbers
		z = y >> x;
		System.out.println(z);
		System.out.println(Integer.toBinaryString(z));
		
		// should be a value of 0, does not go into negative numbers
		z = x >> y;
		System.out.println(z);
		System.out.println(Integer.toBinaryString(z) + "\n");		
	}
	
	public void postfixOperator() {
		int x = 11;
		System.out.println("Before Operator: " + x);
		
		x++;
		System.out.println("After ++ Operator: " + x + "\n");
	}
	
	public void incrementsOfVariable() {
		int x =  216;
		System.out.println(x);
		
		x++;
		System.out.println(x);
		
		x += 1;
		System.out.println(x);
		
		++x;
		System.out.println(x);
		System.out.println(++x);

	}
	
	public void sumOperators() {
		int x = 5;
		int y = 8;
		
		// int sum = y + ++x;
		System.out.println(y + x++);
	}
	
	

}
