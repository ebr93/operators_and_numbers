package com.perscholas.operators_numbers;

public class OperatorsNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		question1();
		question2();
		question3(88);
		question4(1555);
		question5();
		question6();
		question7();
		question8();

	}
	
	/*
	 * Write the following integers in binary notation. Do not use any Java functions or online 
	 * conversion applications to calculate the answer, as this will hinder the learning process 
	 * and your understanding of the concept. However, you may check your answers using Java methods.
	 */
	public static void question1() {
		// 1 = 1
		// 8 = 1000
		// 33 = 100001
		// 78 = 1001110
		// 787 = 1100010011
		// 33987 = 1000010011000011
	}
	
	/*
	 * Convert the following binary numbers to decimal notation. Do not use any Java functions or 
	 * online conversion applications to calculate the answer, as this will hinder the learning 
	 * process and your understanding of the concept. However, you may check your answers using 
	 * Java methods.
	 */
	public static void question2() {
		// 0010 = 2
		// 1001 = 9
		// 0011 0100 = 52
		// 0111 0010 = 114
		// 0010 0001 1111 = 543
		// 0010 1100 0110 0111 = 11367
	}
	
	/*
	 * Write a program that declares an integer a variable x and assigns the value 2 to it 
	 * and prints out the binary string version of the number ( Integer.toBinaryString(x) ). 
	 * Now, use the left shift operator (<<) to shift by 1 and assign the result to x. Before 
	 * printing the results, write a comment with the predicted decimal value and binary string. 
	 * Now, print out x in decimal form and in binary notation.
			Do the preceding exercise with the following values:
			9
			17
			88
	 */
	public static void question3(int n) {
		int x = n;
		System.out.println("Decimal: " + x);
		System.out.println("Binary: " + Integer.toBinaryString(x));
		// shifts bits by a given number to the left, adding bits, making them bigger
		x = n << 1;
		System.out.println("Decimal Shifted: " + x);
		System.out.println("Binary Shifted: " + Integer.toBinaryString(x) + "\n");
	}
	
	
	/*
	 * Write a program that declares a variable x and assigns 150 to it, and prints out the binary 
	 * string version of the number. Now use the right shift operator (>>) to shift by 2 and 
	 * assign the result to x. Write a comment indicating what you anticipate the decimal and 
	 * binary values to be. Now print the value of x and the binary string.
			Do the preceding exercise with the following values:
			225
			1555
			32456
	 */
	public static void question4(int n) {
		int x = n;
		System.out.println("Decimal: " + x);
		System.out.println("Binary: " + Integer.toBinaryString(x));
		// shifts bits by a given number to the right, losing bits, making them smaller
		x = n >> 2;
		System.out.println("Decimal Shifted: " + x);
		System.out.println("Binary Shifted: " + Integer.toBinaryString(x) + "\n");
	}
	
	/*
	 * Write a program that declares three int variables x, y, and z. Assign 7 to x and 17 to y. 
	 * Write a comment that indicates what you predict will be the result of the bitwise & 
	 * operation on x and y. Now use the bitwise & operator to derive the decimal and binary 
	 * values and assign the result to z.
	 * Now, with the preceding values, use the bitwise | operator to calculate the “or” value 
	 * between x and y. As before, write a comment that indicates what you predict the values 
	 * to be before printing them out.
	 */
	public static void question5() {
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
	
	/*
	 * Write a program that declares an integer variable, assigns a number, and uses a postfix 
	 * increment operator to increase the value. Print the value before and after the increment 
	 * operator.
	 */
	public static void question6() {
		int x = 11;
		System.out.println("Before Operator: " + x);
		
		x++;
		System.out.println("After ++ Operator: " + x + "\n");
	}
	
	
	/*
	 * Write a program that demonstrates at least 3 ways to increment a variable by 1 and does 
	 * this multiple times. Assign a value to an integer variable, print it, increment by 1, 
	 * print it again, increment by 1, and then print it again.
	 */
	public static void question7() {
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
	
	/*
	 * Write a program that declares 2 integer variables, x, and y, and then assigns 5 to x and 8 
	 * to y. Create another variable sum and assign the value of ++x added to y, and print 
	 * the result. Notice the value of the sum (should be 14). Now change the increment operator 
	 * to postfix (x++) and re-run the program. Notice what the value of the sum is. 
	 * The first configuration incremented x and then calculated the sum, while the second 
	 * configuration calculated the sum and then incremented x.
	 */
	public static void question8() {
		int x = 5;
		int y = 8;
		
		// int sum = y + ++x;
		System.out.println(y + x++);
	}
}
