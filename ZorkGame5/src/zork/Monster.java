/**
 * ---------------------------------------------------------------------------
 * File name: Monster.java
 * Project name: Zork
 * ---------------------------------------------------------------------------
 * Creator's name and email: Christian Livengood, livengoodc@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Oct 31, 2019
 * ---------------------------------------------------------------------------
 */

package zork;


/**
 * The monster class
 *
 * <hr>
 * Date created: Oct 31, 2019
 * <hr>
 * @author Christian Livengood
 */
public class Monster extends Character {
	
	protected static String monsterName = "Bob";
	protected static int monsterHealth = 20;
	protected static int monsterDamage = 3;
	
	public Monster(String name,int health, int damage, Weapon weapon) throws Exception{
		super(monsterName, monsterHealth, monsterDamage, weapon);
	}
	
	/**
	 * Default Constructor that will generate a monster with a different name       
	 *
	 * <hr>
	 * Date created: Oct 31, 2019 
	 *
	 * 
	 */
	public Monster() throws Exception {
		super(monsterName, monsterHealth, monsterDamage, null);
		
	}
	
	
	/**
	 * @return monsterHealth
	 */
	public static int getMonsterHealth ( )
	{
		return monsterHealth;
	}

	
	/**
	 * @return monsterDamage
	 */
	public static int getMonsterDamage ( )
	{
		return monsterDamage;
	}

	
	/**
	 * @return mONSTER_HEALTH
	 */
	public static int getMONSTER_HEALTH ( )
	{
		return monsterHealth;
	}

	
	/**
	 * @param mONSTER_HEALTH the mONSTER_HEALTH to set
	 */
	public static void setMONSTER_HEALTH (int mONSTER_HEALTH)
	{
		monsterHealth = mONSTER_HEALTH;
	}

	
	/**
	 * @return mONSTER_DAMAGE
	 */
	public static int getMONSTER_DAMAGE ( )
	{
		return monsterDamage;
	}

	
	/**
	 * @param mONSTER_DAMAGE the mONSTER_DAMAGE to set
	 */
	public static void setMONSTER_DAMAGE (int mONSTER_DAMAGE)
	{
		monsterDamage = mONSTER_DAMAGE;
	}

	
}
