package com.perscholas.operators_numbers;

public class MainClass {

	public static void main(String[] args) {
		// Binary Notation Exercise
		BinaryNotation bn = new BinaryNotation();
		
		bn.decToBinary(1); 		// 1
		bn.decToBinary(8); 		// 1000
		bn.decToBinary(33); 	// 100001
		bn.decToBinary(78); 	// 1001110
		bn.decToBinary(787); 	// 1100010011
		bn.decToBinary(33987); 	// 1000010011000011
		
		bn.binToDecimal(10); 				// 2
		bn.binToDecimal(1001); 				// 9
		bn.binToDecimal(110100); 			// 52
		bn.binToDecimal(1110010); 			// 114
		bn.binToDecimal(1000011111); 		// 543
		bn.binToDecimal(10110001100111L); 	// 11367

		// Practice Exercises
		Practice pt = new Practice();
		
		// Testing << operator
		System.out.println("\nPractice Exercises" + "\n");
		System.out.println("intToBinaryLeft Results: ");
		pt.intToBinaryLeft(2);
		pt.intToBinaryLeft(9);
		pt.intToBinaryLeft(17);
		pt.intToBinaryLeft(88);

		// Testing >> operator
		System.out.println("intToBinaryRight Results: ");
		pt.intToBinaryRight(150);
		pt.intToBinaryRight(225);
		pt.intToBinaryRight(1555);
		pt.intToBinaryRight(32456);
		
		// Testing operators & and |
		System.out.println("bitwiseOperators Results: ");
		pt.bitwiseOperators();
		
		// Personal practice with >> and <<
		System.out.println("bitwiseOperator Results: ");
		pt.bitwiseOperator();
		
		// x++
		System.out.println("postfixOperator Results: ");
		pt.postfixOperator();
		
		// x++, x+=1, ++x
		System.out.println("incrementsOfVariable Results: ");
		pt.incrementsOfVariable();
		
		
		System.out.println("\nsumOperators Results: ");
		pt.sumOperators();
	}

}
