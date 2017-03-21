import java.util.*;

public class DevisionMethod1 {
	
	public static void main(String[] args){
/*		Scanner in = new Scanner(System.in);
		int divisor = in.nextInt(); // i = divisor (the players number which is what the monsters num will be 
						  		// 		divided by)
		int dividends[] = new int[10];
		int quotient;
		Random dividendElement = new Random();
		int i;

		if(divisor == 0)
		{
			System.exit(0);
		}
		else if (divisor == 1)
		{
			dividends[0] = 0;
			dividends[1] = 1;
			dividends[2] = 2;
			dividends[3] = 3;
			dividends[4] = 4;
			dividends[5] = 5;
			dividends[6] = 6;
			dividends[7] = 7;
			dividends[8] = 8;
			dividends[9] = 9;
		
			i = dividendElement.nextInt(10);
		
			System.out.println("The dividend is: " + dividends[i]);
			System.out.println("The divisor is: " + divisor);
			quotient = dividends[i] / divisor;
			System.out.println("The quotient is: " + quotient);
		}
*/
		
		/*	The next test ( which i think might be more efficient and faster. This one
		 * 		consist of just making a random number generator for both the divisor
		 * 		and dividend. The divisor will be from 1-9 and the dividend will be from 
		 * 		0-81. The idea is that the dividend will keep running till the divisor 
		 * 		can evenly divide into it ( mod is 0)
		 */
		
		Random divisorGenerator = new Random();
		Random dividendGenerator = new Random();
		
		int divisor = divisorGenerator.nextInt(10) + 1;
		int dividend = dividendGenerator.nextInt(82);
		int quotient;
		int count = 0;
		
		while(dividend % divisor != 0)
		{
			System.out.println(dividend + "\n");
			dividend = dividendGenerator.nextInt(82);
			count++;
		}
		System.out.println("It took " + count + " loops to find an evenly divisable #");
		System.out.println("The dividend is: " + dividend);
		System.out.println("The divisor is: " + divisor);
		quotient = dividend / divisor;
		System.out.println("The quotient is: " + quotient);
		
		// Think this is the one we gonna go with, much less code (atleast like this)
		// 		and so far looks to run relatively fast (im no sure how to figure out
		//		what time in ms it takes to run either, in VS it would show you but i
		//		do not know how to show that in ecplise)
	}
}
