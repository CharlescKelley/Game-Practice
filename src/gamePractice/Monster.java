package gamePractice;

public class Monster {

	int health;
	
	/*	health = The monster health that will decrease when player makes 
	 * 		a successful attack. Will also increase as levels increase.
	 */
	
	int damage;
	
	/*	damage = The damage amount the monster does to the player. Will change
	 * 		as the levels increase.
	 */
	
	int numOfIncorrectAns;
	
	/*	numOfIncorrectAns = The amount of times the character has gotten an answer 
	 * 		wrong. If they get three wrong in a row the monster crits on the player.
	 * 		
	 */
	
	int name;
	
	/*	name = The name of the monster to be displayed during battle
	 */
}
