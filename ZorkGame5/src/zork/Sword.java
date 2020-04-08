/**
 * ---------------------------------------------------------------------------
 * File name: Sword.java
 * Project name: Zork
 * ---------------------------------------------------------------------------
 * Creator's name and email: Christian Livengood, livengoodc@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Oct 31, 2019
 * ---------------------------------------------------------------------------
 */

package zork;


/**
 * the sword object that extends Weapon
 *
 * <hr>
 * Date created: Oct 31, 2019
 * <hr>
 * @author Christian Livengood
 */
public class Sword extends Weapon
{
	private final static String NAME = "Sword";
	private final static int DAMAGE_MOD = 3;
	
	/**
	 * Default Constructor        
	 *
	 * <hr>
	 * Date created: Oct 31, 2019 
	 *
	 * 
	 */
	public Sword()
	{
		super(DAMAGE_MOD, NAME);
	}
	
}
