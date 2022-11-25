package com.perscholas.operators_numbers;

public class BinaryNotation {
	
	// Method to turn decimal to binary notation
	public static void decToBinary(int n) {
		int[] binary = new int[n];
		int i = 0;
		
		while (n > 0) {
			binary[i++] = n % 2;
			n = n / 2;
		}
		
		printBinary(binary, i); 
	}
	
    // Method to print binary number
    public static void printBinary(int[] binary, int index) {
        // Iterates over array
        for (int i = index - 1; i >= 0; i--)
            System.out.print(binary[i] + "");
    }
    
    public static void binToDecimal(int binary) {
    	int decNumber = 0;
    	int i = 0;
    	int remainder;
    	
    	while (binary != 0) {
    		remainder = binary % 10;
    		binary /= 10;
    		decNumber += remainder * Math.pow(2, i);
    		i++;
    	}
    	
    	System.out.println(decNumber);
    }
    
    // Main Driver Code
    public static void main(String[] args) { 
        // Calling Our Above Function
        decToBinary(2);
        System.out.println();
        System.out.println(Integer.toBinaryString(9));
        
        System.out.println(Integer.parseInt("0010", 2));
        System.out.println(Integer.parseInt("1001", 2));
        /*
		0011 0100
		0111 0010
		0010 0001 1111
		0010 1100 0110 0111
         */
    }
}
