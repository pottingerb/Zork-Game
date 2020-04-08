/**
 * ---------------------------------------------------------------------------
 * File name: Weapon.java
 * Project name: Zork
 * ---------------------------------------------------------------------------
 * Creator's name and email: Christian Livengood, livengoodc@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Oct 31, 2019
 * ---------------------------------------------------------------------------
 */

package zork;


/**
 * The weapon class
 *
 * <hr>
 * Date created: Oct 31, 2019
 * <hr>
 * @author Christian Livengood
 */
public class Weapon
{
	private int damageMod = 3;
	private String name = "";

	
	/**
	 * Default Constructor the sets a random weapon.       
	 *
	 * <hr>
	 * Date created: Oct 31, 2019 
	 *
	 * 
	 */
	public Weapon ( )
	{
		super ( );
		
	}

	/**
	 * Parameterized Constructor        
	 *
	 * <hr>
	 * Date created: Oct 31, 2019 
	 *
	 * 
	 * @param damageMod
	 * @param name
	 */
	public Weapon (int damageMod, String name)
	{
		super ( );
		this.damageMod = damageMod;
		this.name = name;
	}

	/**
	 * getter for the for the damage modifier
	 * 
	 * @return damageMod
	 */
	public int getDamageMod ( )
	{
		return damageMod;
	}
	
	/**
	 * setter for the damage modifier
	 * 
	 * @param damageMod the damageMod to set
	 */
	public void setDamageMod (int damageMod)
	{
		this.damageMod = damageMod;
	}
	
	/**
	 * 
	 * getter for name
	 * @return name
	 */
	public String getName ( )
	{
		return name;
	}
	
	/**
	 * setter for name
	 * 
	 * @param name the name to set
	 */
	public void setName (String name)
	{
		this.name = name;
	}

	/**
	 * Just returns the weapon name      
	 *
	 * <hr>
	 * Date created: Oct 31, 2019 
	 *
	 * <hr>
	 * @return
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString ( )
	{
		return name;
	}
	/**
	 * This is to get the first letter of the weapon's name for the map        
	 *
	 * <hr>
	 * Date created: Nov 2, 2019 
	 *
	 * <hr>
	 * @return
	 * @see java.lang.Object#toString()
	 */
	
	public String charReturn ( )
	{
		char cName = name.charAt (0);
		String sName = String.valueOf (cName);
		
		
		return sName;
	}
}
