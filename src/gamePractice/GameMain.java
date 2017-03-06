package gamePractice;

public class GameMain {

	public static void main(String[] args) {
		
		// Variables that used only in this class.
		int level;
		
		/* level = the level the player is on which will also help keep track of what 
		 * 		checkpoint, if any, the player is at. Will also determine how much time is 
		 * 		given to the player. Also determines how much health/damage the monster and 
		 * 		player have. 
		 */
		
		int amountOfTime;
		
		/* amountOfTime = The amount of time the player has to complete the level. This will
		 * 		change as the levels increase. It will start at 10 seconds for the first 
		 * 		5 levels then decrease from there either by 5 or by 2, haven't decided
		 * 		which one yet. 
		 */
		
		int numOfCorrectAnswers;
		
		/* numOfCorrectAnswers = Don't really remember why this is here but i think this was 
		 * 		for determining possible crits the player does if he/she answers a certain 
		 * 		number right. Also could be for calculating an average so the player can see 
		 * 		how well he/she is doing. 
		 */
		
		int numOfWrongAnswers;
		
		/* numOfWrongAnswers = Don't really remember why this is here but i think this was 
		 * 		for determining possible crits the player does if he/she answers a certain 
		 * 		number right. Also could be for calculating an average so the player can see 
		 * 		how well he/she is doing. 
		 */
		
		double averageOfAnswers;
		
		/* averageOfAnswers = For the statistics that are shown to the player so he/she
		 * 		can know how bad or good they are doing.
		 */
		
		int charDeaths;
		
		/* charDeaths = The number of time the player has died. If the player dies then 
		 * 		they have to start over from the checkpoint. If player has 3 deaths then they
		 * 		have to start over from the beginning of the game. 
		 */
		
		int checkPoint;
		
		/* checkpoint = Places where the player will start over if they die, before they have
		 * 		3 deaths. 
		 */
	}

}
