public class systems2{
	public static void main(String[] args) {
		//sample
		// x = 3
		// y = -4
		//  2x - 3y = 18
		// -5x - 2y = -7

		int x1, y1, s1;
		int x2, y2, s2;
		int X, Y;
		
		x1 =  2;
		y1 = -3;
		s1 = 18;

		x2 = -5;
		y2 = -2;
		s2 = -7;

		int eq1[] = {x1 , y1 , s1};
		int eq2[] = {x2 , y2 , s2};
		int eqy[] = {0  , 0  , 0 };
		int num1;
		int num2;
		
		printeq(eq1 , eq2);

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

		//calc X
		s1 = s1 - ( Y * y1);
		X = s1/x1;

		//print X and Y
		System.out.println("** x = "+X+"  &  y = "+Y+" **");



	}

	public static void printeq(int eq1[], int eq2[]){
		
		int x1 = eq1[0];
		int y1 = eq1[1];
		int s1 = eq1[2];

		int x2 = eq2[0];
		int y2 = eq2[1];
		int s2 = eq2[2];

		System.out.println("_____________");
		System.out.println(x1+"x + "+y1+"y = "+s1);
		System.out.println(x2+"x + "+y2+"y = "+s2);
		System.out.println("_____________");

	}
}
