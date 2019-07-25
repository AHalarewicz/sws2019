public class systems2{
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

		int eq1[] = {x1 , y1 , z1 , s1};
		int eq2[] = {x2 , y2 , z2 , s2};
		int eq3[] = {x3 , y3 , z3 , s3};
		int eqy[] = {0  , 0  , 0  , 0 };
		int eqz[] = {0  , 0  , 0  , 0 };
		int num1;
		int num2;
		int num3;
		
		printeq(eq1 , eq2 , eq3);

		// eliminate x-coefs to create a 2 var system
		for (int i = 0; i < eq1.length; i++){
			num1 = eq1[i];
			num2 = eq2[i];
			num3 = eq3[i];


		}

		// mult by const to create matching  x coef
		for (int i = 0; i < eq1.length; i++){
			num1 = eq1[i];
			num2 = eq2[i];
			num1 = num1 * x1 * x2;
			num2 = num2 * x1 * x1;
			eq1[i] = num1;
			eq2[i] = num2;
		}

		printeq(eq1 , eq2);

		// subtract equations to eliminate x
		for (int i=0 ; i < eq1.length; i++){
			eqy[i] = eq1[i] - eq2[i];
		}

		// calc Y
		Y = eqy[2]/eqy[1];

		// calc X
		s1 = s1 - ( Y * y1);
		X = s1/x1;

		// print X, Y, and Z
		System.out.println("** x = "+X+"  &  y = "+Y+" **");



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
		int y2 = eq3[1];
		int z2 = eq3[2];
		int s1 = eq3[3];

		System.out.println("_____________");
		System.out.println(x1+"x + "+y1+"y + "+z1+"z = "+s1);
		System.out.println(x2+"x + "+y2+"y + "+z2+"z = "+s2);
		System.out.println(x3+"x + "+y3+"y + "+z3+"z = "+s3);
		System.out.println("_____________");

	}
}
