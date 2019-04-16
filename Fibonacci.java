/**
 * 
 */

/**
 * @author Indra
 *
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	static int firstNumber, secondNumber = 1, next;
	public static void main(String[] args) {
		generateFibonacciUsingArrays(20);
		System.out.println();
		generateFibonacciSimple(20);
		System.out.println();
		System.out.print(firstNumber + " " + secondNumber + " ");
		int size = 20;
		generateFibonacciRecursion(size - 2);
	}
	// using arrays
	public static void generateFibonacciUsingArrays(int size) {
		int firstNumber = 0;
		int secondNumber = 1;
		int[] arr = new int[size];
		arr[0] = firstNumber;
		arr[1] = secondNumber;
		// use print or println to print on same or different lines respectively
		System.out.print(arr[0] + " ");
		System.out.print(arr[1] + " ");
		for (int i=2;i<size;i++) {
			arr[i] = arr[i-1] +arr[i-2];
			System.out.print(arr[i] + " ");
		}
	}
	
	// using simple math
	public static void generateFibonacciSimple(int size) {
		int firstNumber = 0;
		int secondNumber = 1;
		int next;
		System.out.print(firstNumber + " " +secondNumber+ " ");
		for (int i=2;i<size;i++) {
			next = firstNumber + secondNumber;
			System.out.print(next + " ");
			firstNumber = secondNumber;
			secondNumber = next;
			
		}
	}
	
	// recursion
	public static void generateFibonacciRecursion(int size) {
		if (size > 0) {
			 next = firstNumber + secondNumber;    
	         firstNumber = secondNumber;    
	         secondNumber = next;    
	         System.out.print(next + " ");   
	         generateFibonacciRecursion(size-1);    
		}
	}
}
