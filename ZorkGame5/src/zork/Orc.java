/**
 * ---------------------------------------------------------------------------
 * File name: Orc.java
 * Project name: Zork
 * ---------------------------------------------------------------------------
 * Creator's name and email: Christian Livengood, livengoodc@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Nov 4, 2019
 * ---------------------------------------------------------------------------
 */

package zork;


/**
 * the orc monster
 *
 * <hr>
 * Date created: Nov 4, 2019
 * <hr>
 * @author Christian Livengood
 */
public class Orc extends Monster
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
	public Orc ( ) throws Exception
	{
		super ( );
		monsterName = "Orc";
		monsterHealth = 24;
		monsterDamage = 4;
	}

}
