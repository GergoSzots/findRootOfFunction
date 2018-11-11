import java.util.Scanner;

public class NewtonMethod {

	
	public void newtonMethod(double x, double r, double e) {
		/*With this program you can use the Newton method to compute 
		the square root of a number or function numerically.
		[x] is the number, the root of which you'd like to know 
		[r] is the aprox. root of your number
		[e] is the convergence criteria*/
			
		double num_it = r;
		int count = 0;
		double num_guess = num_it + 100;
		long startTime = System.nanoTime();
		while((Math.abs(num_guess-num_it)) > e) {
			
				num_guess = num_it;
				num_it = num_it - (Math.pow(num_it, 2) - x)/2/num_it;
				count++;

		System.out.println("Result after " + count + ". iteration is " + num_it);

		}
		long endTime = System.nanoTime();
		double totalTime = (endTime-startTime)/Math.pow(10, 9);
		System.out.println("Iteration reached its limit in " + count + " step(s).");
		System.out.println("You needed " + totalTime + " s to reach the conversion criteria.");
	}
	
	public void newtonMethod() {
		/*If you want your program more interactive you can use this method
		the convergence criteria is 0.001 as default*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Pick a number, the root of which you'd like to know: ");
		double x = scan.nextDouble();
		System.out.println("Now where should I start? Give me a reasonable number:");
		double num_it = scan.nextDouble();
		double e = 0.001; 
		
		int count = 0;
		double num_guess = num_it + 100;
		long startTime = System.nanoTime();
		while((Math.abs(num_guess-num_it)) > e) {
			
				num_guess = num_it;
				num_it = num_it - (Math.pow(num_it, 2) - x)/2/num_it;
				count++;

		System.out.println("Result after " + count + ". iteration is " + num_it);

		}
		long endTime = System.nanoTime();
		double totalTime = (endTime-startTime)/Math.pow(10, 9);
		System.out.println("Iteration reached its limit in " + count + " step(s).");
		System.out.println("You needed " + totalTime + " s to reach the conversion criteria.");
	}
}
