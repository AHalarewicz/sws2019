// import the scanner class to obtain user input
import java.util.Scanner;
// import the math class to compute square roots
import java.lang.Math;

public class vertexForm{
	public static void main(String[] args) {
		
		// print description of the program
		String description1 = "This program evaluates a quadratic trinomial equation in standard form\n";
		String description2 = "and displays all of the relevant information to the user.\n";
		System.out.println(description1 + description2);

		// Explain expectations for input
		String instructions = "The quadratic trinomial equation in standard form should resemble\nY[x] = A*x^2 + B*x + C\n\nPlease provide A, B, and C when prompted.";
		System.out.println(instructions);

		// create a new scanner object
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

		// print equation in standard form
		System.out.println("Evaluating Y[x] = "+a+"x^2 + "+b+"x +"+c);

		// compute and print discriminant
		double discriminant;
		discriminant = (b*b) - 4*(a)*(c);
		System.out.println("Discriminant = " + discriminant);
		
		// compute and print vertex
		double x = -(b/(2*a));
		double h = x;
		double k = a*(x*x) + b*(x) + c;
		double [] vertex = new double [] {h,k};
		System.out.println("A.o.S : x = "+x);
		System.out.println("Vertex = ("+h+" , "+k+")");

		// compute and print roots
		if (discriminant > 0){
			double r1 = (-b - Math.sqrt(discriminant))/(2*a);
			double r2 = (-b + Math.sqrt(discriminant))/(2*a);
			System.out.println("Roots = {("+r1+" , 0) & ("+r2+" , 0)}");
		}else if (discriminant == 0){
			System.out.println("Root = vertex = ("+h+" , "+k+")");
		}else{
			System.out.println("NO REAL ROOTS");
		}
		
		// print y-intercept
		System.out.println("Y-intercept = (0 , "+c+")");

		// print vertex form
		System.out.println("Vertex Form: Y[x] = "+a+"* (x - "+h+")^2  + "+k);
		
		// print Domain
		System.out.println("Domain: {x = R}");

		// compute and print Range
		String sign;
		if (a<0){
			sign = " <= ";
		}
		else{
			sign = " >= ";
		}
		System.out.println("Range: {Y" + sign + k+"}");


		// compute and print focus
		double fx = h;
		double fy = k + (1/(4*a));
		System.out.println("Focus: ("+fx+" , "+fy+")");

		// compute and print directrix
		// a bit tricky but simple
		double directrix = k - (1/(4*a));
		// dir = k + (1/(4*a));
		System.out.println("Directrix: y = "+directrix);

	
		// print done
		System.out.println("\n\nDONE");







	}
}
