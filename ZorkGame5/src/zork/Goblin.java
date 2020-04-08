/**
 * ---------------------------------------------------------------------------
 * File name: Goblin.java
 * Project name: Zork
 * ---------------------------------------------------------------------------
 * Creator's name and email: Christian Livengood, livengoodc@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Nov 4, 2019
 * ---------------------------------------------------------------------------
 */

package zork;


/**
 * the goblin monster
 *
 * <hr>
 * Date created: Nov 4, 2019
 * <hr>
 * @author Christian Livengood
 */
public class Goblin extends Monster
{

	
	/**
	 * Constructor        
	 *
	 * <hr>
	 * Date created: Nov 4, 2019 
	 *
	 * 
	 * @throws Exception
	 */
	public Goblin ( ) throws Exception
	{
		super ( );
		monsterName = "Goblin";
		monsterHealth = 12;
		monsterDamage = 2;
	}

}
