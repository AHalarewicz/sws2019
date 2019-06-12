// import the scanner class to obtain user input
import java.util.Scanner;
// import the math class to compute square roots
import java.lang.Math;

public class quadraticFormula{
	public static void main(String[] args) {
		
		// print description of the program
		String description = "This program provides the vertex and intercepts of a quadratic trinomial equation in standard form.\n";
		System.out.println(description);

		// Explain expectations for input
		String instructions = "The quadratic trinomial equation in standard form should resemble\nY[x] = A*x^2 + B*x + C\n\nPlease provide A, B, and C when prompted.";
		System.out.println(instructions);

		// create a new scanne object
		Scanner input = new Scanner(System.in);

		// prompt A
		System.out.print("A = ");
		double a = input.nextDouble();

		// prompt B
		System.out.print("B = ");
		double b = input.nextDouble();

		// prompt C
		System.out.print("C = ");
		double c = input.nextDouble();

		// compute discriminant
		double discriminant;
		discriminant = (b*b) - 4*(a)*(c);
		
		//compute vertex
		double x = -(b/(2*a));
		double y = a*(x*x) + b*(x) + c;
		double [] vertex = new double [] {x,y};

		//compute roots
		double r1 = 0.0;
		double r2 = 0.0;
		if (discriminant >=0){
			r1 = (-b - Math.sqrt(discriminant))/(2*a);
			r2 = (-b + Math.sqrt(discriminant))/(2*a);
		}else{
			System.out.println("NO REAL ROOTS");
		}

		// print data
		System.out.println("Evaluating Y[x] = "+a+"x^2 + "+b+"x + "+c);
		System.out.println("Discriminant = " + discriminant);
		System.out.println("Vertex = ("+x+","+y+")");
		System.out.println("Roots = ("+r1+",0) & ("+r2+",0)");
		System.out.println("YInt = (0,"+c+")");

	
		
		System.out.println("\n\nDONE");







	}
}
