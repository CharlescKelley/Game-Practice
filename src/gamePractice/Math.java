package gamePractice;

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
	
	private void setRange(){
		
	}
}
