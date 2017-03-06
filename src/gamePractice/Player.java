package gamePractice;

public class Player {

	int health;
	
	/*	health = The health of the player. Will level up with the player and
	 * 		decrease when attacked by a Monster.
	 */
	
	int damage;
	
	/*	damage = The damage the player will do to the monster. Will change as
	 * 		these player levels up. 
	 */
	
	int numOfCorrectAns;
	
	/*	numOfCorrectAns = The numbers of correct answers which will be used to 
	 * 		calculate the crits the player can do when they make multiple correct 
	 * 		answers (most likely 3)
	 */
	
	int name;
	
	/*	name = The name the player chooses for their character
	 */
	
	int lives;
	
	/*	lives = The lives of the player that will decrease upon his/her death. Will 
	 * 		start at 3 and decrease upon death until 0. Once at 0 the player will have
	 * 		to start back at previous checkpoint.
	 */
}
