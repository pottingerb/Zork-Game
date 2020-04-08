/**
 * ---------------------------------------------------------------------------
 * File name: Zombie.java
 * Project name: Zork
 * ---------------------------------------------------------------------------
 * Creator's name and email: Christian Livengood, livengoodc@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Nov 4, 2019
 * ---------------------------------------------------------------------------
 */

package zork;


/**
 * the zombie class
 *
 * <hr>
 * Date created: Nov 4, 2019
 * <hr>
 * @author Christian Livengood
 */
public class Zombie extends Monster
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
	public Zombie ( ) throws Exception
	{
		super ( );
		monsterName = "Zombie";
		monsterHealth = 16;
		monsterDamage = 3;
	}

}
