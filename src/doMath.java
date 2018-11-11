
public class doMath {

	public static void main(String[] args) {
		
		function f1 = new function();
		
		NewtonMethod newton = new NewtonMethod();
		newton.newtonMethod(f1.createFunction(300), 10, 0.001);
//		newton.newtonMethod();
//		
		SecantMethod secant = new SecantMethod();
		secant.secantMethod1(f1.createFunction(300), 10, 11, 0.001);
//		secant.secantMethod1();

		

	}

}
