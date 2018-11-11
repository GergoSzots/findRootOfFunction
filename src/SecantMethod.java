import java.util.Scanner;

public class SecantMethod {
	
	public void secantMethod1(double x, double num0, double num1, double e) {
		/*With this program you can use the Secant method to compute
		the square root of a number or function numerically.
		[x] is the number, the root of which you'd like to know 
		[num0] and [num1] are aprox. roots of your number
		[e] is the convergence criteria*/
		
		
		double num2; 
		int count = 0;
		long startTime = System.nanoTime();;
		while(count < 100) {
			
			num2 = num1 - (num1 - num0) * (num1 * num1 - x) / ((num1 * num1 - x) - (num0 * num0 - x));
			num0 = num1;
			num1 = num2;
			
			count++;
			System.out.println("After " + count + " iteration,the result is: " + num2);
			if (Math.abs(num1-num0) < e ) {
				break;
			}
			
		}
		long endTime = System.nanoTime();
		double totalTime = (endTime - startTime)/Math.pow(10, 9);
		System.out.println("Iteration reached its limit in " + count + " step(s).");
		System.out.println("You needed " + totalTime + " s to reach the conversion criteria.");
					
	}
	
	public void secantMethod1() {
		/*If you want your program more interactive you can use this method
		the convergence criteria is 0.001 as default*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Pick a number, the root of which you'd like to know: ");
		double x = scan.nextDouble();
		System.out.println("Now where should I start? Give me two reasonable numbers:");
		double num0 = scan.nextDouble();
		double num1 = scan.nextDouble();
		double e = 0.001;
		
		double num2; 
		int count = 0;
		long startTime = System.nanoTime();;
		while(count < 100) {
			
			num2 = num1 - (num1 - num0) * (num1 * num1 - x) / ((num1 * num1 - x) - (num0 * num0 - x));
			num0 = num1;
			num1 = num2;
			
			count++;
			System.out.println("After " + count + " iteration,the result is: " + num2);
			if (Math.abs(num1-num0) < e ) {
				break;
			}
			
		}
		long endTime = System.nanoTime();
		double totalTime = (endTime - startTime)/Math.pow(10, 9);
		System.out.println("Iteration reached its limit in " + count + " step(s).");
		System.out.println("You needed " + totalTime + " s to reach the conversion criteria.");
					
	}
	
}


