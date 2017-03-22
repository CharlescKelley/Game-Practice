package gamePractice;

import java.util.*;

public class Math {
	
	private int playerNum;
	
	/* playerNum = the number that shows up on the players side of the screen.
	 * 		determined by the range selected by the player. Haven't decided if 
	 * 		it will only be the range or if the player can just pick and choose
	 * 		which number they want to use or both. It will most likely be both.
	 */
	
	private int monsterNum;
	
	/* monsterNum = the number that shows up on the players side of the screen.
	 * 		determined by the range selected by the player. Haven't decided if 
	 * 		it will only be the range or if the player can just pick and choose
	 * 		which number they want to use or both. It will most likely be both.
	 */
	
	private int correctAnswer;
	
	/* correctAnswer = the answer that is determined by the computer as correct
	 * 		which will be compared to the answer chosen by the player.
	 */
	
	private int playerAnswer; 
	
	/* playerAnswer = The answer that the player has chosen to be correct which 
	 * 		is compared to the correct answer.
	 */
	
	private boolean isAnswerCorrect;
	
	/* isAnswerCorrect = The boolean value that will changed based on whether or not the 
	 * 		answer the player gives is correct. If it isn't the value will be false.
	 * 		If it is correct the value will be true. Also used by the Game class to figure out
	 * 		how many correct and incorrect answers there have been. 
	 */
	
	private int[] numbers = {0,1,2,3,4,5,6,7,8,9};

	/* numbers = Array for the number values the player can choose from which will be all or 
	 * 		individual ones. 
	 */
	
	
//	private int firstNum; // the character's num
//	private int secondNum; // the monster's num
//	private int actualAnswer; // the correct answer to the problem
//	private int playerAnswer; // the user's answer to the problem
//	private int firstNumUpperBound; // the upper bound the player will choose for the first number
//	private int firstNumLowerBound; // the lower bound the player will choose for the first number
//	private int secondNumUpperBound; // the upper bound the player will choose for the second number
//	private int secondNumLowerBound; // the lower bound the player will choose for the second number
//	private boolean isAnswerCorrect = false; // determine whether or not the player's answer is correct
//	
	
	public void setRange(int num1, int num2){
		
	}
	
	
	
	
	public int addition(int playerNum, int monsterNum, int playerAnswer){
		correctAnswer =  playerNum + monsterNum;
		System.out.println("The correct answer is: " + correctAnswer);
		if (playerAnswer == correctAnswer)
		{
			System.out.println("YOUR ANSWER IS CORRECT!!!");
		}
		else System.out.println("YOUR ANSWER IS INCORRECT SORRY!!!");
		return correctAnswer;
	} // addition for game
	
	public int subtraction(int playerNum, int monsterNum, int playerAnswer){
		correctAnswer =  playerNum - monsterNum;
		System.out.println("The correct answer is: " + correctAnswer);
		if (playerAnswer == correctAnswer)
		{
			System.out.println("YOUR ANSWER IS CORRECT!!!");
		}
		else System.out.println("YOUR ANSWER IS INCORRECT SORRY!!!");
		return correctAnswer;
	} // addition for game
	
	public int multiplication(int playerNum, int monsterNum, int playerAnswer){
		correctAnswer =  playerNum * monsterNum;
		System.out.println("The correct answer is: " + correctAnswer);
		if (playerAnswer == correctAnswer)
		{
			System.out.println("YOUR ANSWER IS CORRECT!!!");
		}
		else System.out.println("YOUR ANSWER IS INCORRECT SORRY!!!");
		return correctAnswer;
	} // addition for game
	
	public void division()
	{
		Scanner in = new Scanner(System.in);
		int playerAns;
		Random divisorGenerator = new Random();
		Random dividendGenerator = new Random();
		
		int divisor = divisorGenerator.nextInt(10) + 1;
		int dividend = dividendGenerator.nextInt(82);
		int quotient;
		
		while(dividend % divisor != 0)
		{
			dividend = dividendGenerator.nextInt(82);
		}
		System.out.println("Your number is: " + dividend + "\n" + "The monster's number is: " + divisor + 
								"\n What is: " + dividend + " / " + divisor + ": \n");
		playerAns = in.nextInt();
		quotient = dividend / divisor;
		System.out.println("The correct answer is: " + quotient);
		if (playerAns == quotient)
		{
			System.out.println("YOUR ANSWER IS CORRECT!!!");
		}
		else System.out.println("YOUR ANSWER IS INCORRECT SORRY!!!");
	}
	
	
	
	
}
