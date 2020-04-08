/**
 * ---------------------------------------------------------------------------
 * File name: Stick.java
 * Project name: Zork
 * ---------------------------------------------------------------------------
 * Creator's name and email: Christian Livengood, livengoodc@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Oct 31, 2019
 * ---------------------------------------------------------------------------
 */

package zork;


/**
 * the stick class that extends weapon
 *
 * <hr>
 * Date created: Oct 31, 2019
 * <hr>
 * @author Christian Livengood
 */
public class Stick extends Weapon
{
	private final static String NAME = "Stick";
	private final static int DAMAGE_MOD = 1;
	
	/**
	 * Default Constructor        
	 *
	 * <hr>
	 * Date created: Oct 31, 2019 
	 *
	 * 
	 */
	public Stick()
	{
		super(DAMAGE_MOD, NAME);
	}
	
}
