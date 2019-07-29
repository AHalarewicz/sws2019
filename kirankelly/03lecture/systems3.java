public class systems3{
	public static void main(String[] args) {
		//sample
		// x = 3
		// y = -4
		// z = 1
		//  2x - 3y + 2z =  20
		// -5x - 2y + 9z =  2
		//  1x + 4y + 3z = -10

		int x1, y1, z1, s1;
		int x2, y2, z2, s2;
		int x3, y3, z3, s3;
		int X, Y, Z;
		
		x1 =  2;
		y1 = -3;
		z1 =  2;
		s1 = 20;

		x2 = -5;
		y2 = -2;
		z2 =  9;
		s2 =  2;

		x3 =  1;
		y3 =  4;
		z3 =  3;
		s3 =-10;

		int eq1[] = {x1 , y1 , z1 , s1};
		int eq2[] = {x2 , y2 , z2 , s2};
		int eq3[] = {x3 , y3 , z3 , s3};
		int num1;
		int num2;
		int num3;
		
		printeq(eq1 , eq2 , eq3);

		// create equal x coefficients
		for (int i = 0; i < eq1.length; i++){
			num1 = eq1[i];
			num2 = eq2[i];
			num3 = eq3[i];
			num1 = num1 * x2 * x3;
			num2 = num2 * x1 * x3;
			num3 = num3 * x1 * x2;
			eq1[i] = num1;
			eq2[i] = num2;
			eq3[i] = num3;
		}
		
		printeq(eq1 , eq2 , eq3);

		// create a 2-var system with y and z
		for (int i = 0; i < eq1.length; i++){
			num1 = eq1[i];
			num2 = eq2[i];
			num3 = eq3[i];
			eq2[i] = num1 - num2;
			eq3[i] = num1 - num3;
		}
		
		printeq(eq1 , eq2 , eq3);

		// mult by const to create matching y-coef
		int a = eq2[1];
		int b = eq3[1];
		for (int i = 1; i < (eq2.length); i++){
			num2 = eq2[i];
			num3 = eq3[i];
			num2 = num2 * b;
			num3 = num3 * a;
			eq2[i] = num2;
			eq3[i] = num3;
		}

		printeq(eq1 , eq2 , eq3);

		// subtract equations to eliminate y
		for (int i=0 ; i < eq2.length; i++){
			eq3[i] = eq2[i] - eq3[i];
		}
		printeq(eq1 , eq2 , eq3);

		// calc Z
		Z = eq3[3]/eq3[2];

		// calc Y
		Y = ( eq2[3] - (Z*eq2[2]) )/ eq2[1];

		// calc X
		X = ( eq1[3] - (Z*eq1[2]) - (Y*eq1[1]) )/ eq1[0];

		// print X, Y, and Z
		System.out.println("** x = "+X+"  &  y = "+Y+"  &  z = "+Z+" **");
	}

	public static void printeq(int eq1[], int eq2[], int eq3[]){
		
		int x1 = eq1[0];
		int y1 = eq1[1];
		int z1 = eq1[2];
		int s1 = eq1[3];

		int x2 = eq2[0];
		int y2 = eq2[1];
		int z2 = eq2[2];
		int s2 = eq2[3];

		int x3 = eq3[0];
		int y3 = eq3[1];
		int z3 = eq3[2];
		int s3 = eq3[3];

		System.out.println("_____________");
		System.out.println(x1+"x + "+y1+"y + "+z1+"z = "+s1);
		System.out.println(x2+"x + "+y2+"y + "+z2+"z = "+s2);
		System.out.println(x3+"x + "+y3+"y + "+z3+"z = "+s3);
		System.out.println("_____________");

	}
}
