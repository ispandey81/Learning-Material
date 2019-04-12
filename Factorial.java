
public class Factorial {

	public static void main(String[] args) {
//		System.out.println(factorial(5));
		System.out.println(factorialWithLoops(5));
	}

	public static int factorial(int n) {
		if (n == 1) return 1;
		return n * factorial(n-1);
	}
	
	public static int factorialWithLoops(int n) {
//		if (n ==1) return 1;
//		int answer = n * (n-1);
//		int loopVar = n -1;
//		while (loopVar > 1) {
//			answer = answer * (loopVar -1);
//			loopVar = loopVar-1;
//		}
//		return answer;
		if (n == 1) return 1;
		int answer = n;
		while (n > 1) {
			answer = answer * (n-1);
			n = n -1;
		}
		return answer;
	}
}
