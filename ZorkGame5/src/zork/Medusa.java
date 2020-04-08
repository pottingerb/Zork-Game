/**
 * ---------------------------------------------------------------------------
 * File name: Medusa.java
 * Project name: Zork
 * ---------------------------------------------------------------------------
 * Creator's name and email: Christian Livengood, livengoodc@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Nov 4, 2019
 * ---------------------------------------------------------------------------
 */

package zork;


/**
 * the Medusa monster
 *
 * <hr>
 * Date created: Nov 4, 2019
 * <hr>
 * @author Christian Livengood
 */
public class Medusa extends Monster
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
	public Medusa ( ) throws Exception
	{
		super ( );
		monsterName = "Medusa";
		monsterHealth = 20;
		monsterDamage = 3;
	}
}
