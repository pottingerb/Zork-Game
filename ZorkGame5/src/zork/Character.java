/**
 * ---------------------------------------------------------------------------
 * File name: Character.java
 * Project name: Zork
 * ---------------------------------------------------------------------------
 * Creator's name and email: Christian Livengood, livengoodc@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Oct 31, 2019
 * ---------------------------------------------------------------------------
 */

package zork;


/**
 * The Main class that which Player and Monster inherit things from
 *
 * <hr>
 * Date created: Oct 31, 2019
 * <hr>
 * @author Christian Livengood
 */
public class Character
{
	protected String name = "None";
	private int health = 100;
	private int damage = 5;
	Weapon weapon;
	boolean isDaed = false;
	boolean hasWeapon = false;
	
	


	/**
	 * Default Constructor        
	 *
	 * <hr>
	 * Date created: Oct 31, 2019 
	 *
	 * 
	 */
	public Character ( ) throws Exception
	{
		this.name = "None";
		this.health = 100;
		this.damage = 5;
	}

	
	/**
	 * Parameterized Constructor        
	 *
	 * <hr>
	 * Date created: Oct 31, 2019 
	 *
	 * 
	 * @param name
	 * @param health
	 * @param damage
	 */
	public Character (String name, int health, int damage, Weapon weapon) throws Exception
	{
		
		this.name = name;
		this.health = health;
		this.damage = damage;
		this.weapon = weapon;
	}

	public Character(String name)
	{
		this.name = name;
	}
	

	
	/**
	 * getter for weapon
	 * 
	 * @return weapon
	 */
	public Weapon getWeapon ( ) throws Exception
	{
		return this.weapon;
	}


	
	/**
	 * setter for weapon
	 * 
	 * @param weapon the weapon to set
	 */
	public void setWeapon (Weapon weapon) throws Exception
	{
		this.weapon = weapon;
	}

	/**
	 * getter for name
	 * 
	 * @return name
	 */
	public String getName ( ) throws Exception
	{
		return name;
	}
	/**
	 * setter for name
	 * 
	 * @param name the name to set
	 */
	@SuppressWarnings ("unused")
	private void setName (String name) throws Exception
	{
		this.name = name;
	}


	
	/**
	 * getter for health
	 * 
	 * @return health
	 */
	public int getHealth ( ) throws Exception
	{
		return health;
	}


	
	/**
	 * Setter for health
	 * 
	 * @param health the health to set
	 */
	@SuppressWarnings ("unused")
	public void setHealth (int health) throws Exception
	{
		this.health = health;
	}


	
	/**
	 * getter for damage
	 * 
	 * 
	 * @return damage
	 */
	public int getDamage ( ) throws Exception
	{
		return damage;
	}


	
	/**
	 * setter for damage
	 * 
	 * @param damage the damage to set
	 */
	@SuppressWarnings ("unused")
	private void setDamage (int damage) throws Exception
	{
		this.damage = damage;
	}

	
	/**
	 * @return isDaed
	 */
	public boolean isDaed ( )
	{
		return isDaed;
	}


	
	/**
	 * @param isDaed the isDaed to set
	 */
	public void setDaed (boolean isDaed)
	{
		this.isDaed = isDaed;
	}


	
	/**
	 * @return hasWeapon
	 */
	public boolean isHasWeapon ( )
	{
		return hasWeapon;
	}


	
	/**
	 * @param hasWeapon the hasWeapon to set
	 */
	public void setHasWeapon (boolean hasWeapon)
	{
		this.hasWeapon = hasWeapon;
	}

	/**
	 * This will check to see if there is a weapon with the character and add the total damage the character will do      
	 *
	 * <hr>
	 * Date created: Oct 31, 2019
	 *
	 * <hr>
	 * @return
	 */
	public int TotalDamage()
	{
		if(weapon != null)
			return damage + weapon.getDamageMod ( );
		else
			return damage;
	}
	
	/**
	 * Overriding the toString       
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
		if(weapon != null)			
			return "Name: " + name + "\nHealth: " + health + "\nDamage: " + TotalDamage() + "\nWeapon: " + weapon.toString ( );		
		else
			return "Name: " + name + "\nHealth: " + health + "\nDamage: " + TotalDamage() + "\nWeapon: none";
	}
	
	
	/**
	 * This is to get the first letter of the character's name for the map        
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
