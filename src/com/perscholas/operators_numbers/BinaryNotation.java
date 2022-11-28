package com.perscholas.operators_numbers;

public class BinaryNotation {
    // Main Driver Code
	
	/*
    public static void main(String[] args) { 
        // Calling Our Above Function
        decToBinary(787);
        System.out.println();
        System.out.println(Integer.toBinaryString(8));
        System.out.println(Integer.toBinaryString(9));
        
        System.out.println(Integer.parseInt("00110100",2));
        System.out.println(Integer.parseInt("1001", 2));
        binToDecimal(110100);
        binToDecimal(1110010);
        binToDecimal(1000011111);
        /*
		1 = 1
		8 = 1000
		33 = 100001
		78 = 1001110
		787 = 1100010011
		33,987 = 1000010011000011
		
		0010 = 2
		1001 = 9
		0011 0100 = 52
		0111 0010 = 114
		0010 0001 1111 = 543
		0010 1100 0110 0111 = 11367

         
    }
	*/
	
	// Method to turn decimal to binary notation
	public void decToBinary(int n) {
		int[] binary = new int[n];
		int i = 0;
		
		while (n > 0) {
			binary[i++] = n % 2;
			n = n / 2;
		}
		
		printBinary(binary, i); 
	}
	
    // Method to print binary number
    public void printBinary(int[] binary, int index) {
        // Iterates over array in reverse order
        for (int i = index - 1; i >= 0; i--) {
        	System.out.print(binary[i] + "");
        }
        System.out.println();
    }
    
    // Method to turn binary to decimal notation
    public void binToDecimal(long binary) {
    	long decNumber = 0;
    	long i = 0;
    	long remainder;
    	
    	while (binary != 0) {
    		remainder = binary % 10;
    		decNumber += remainder * Math.pow(2, i);
    		binary /= 10;
    		i++;
    	}
    	
    	System.out.println(decNumber);
    }
}
