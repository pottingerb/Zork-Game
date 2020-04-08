/**
 * ---------------------------------------------------------------------------
 * File name: Player.java
 * Project name: Zork
 * ---------------------------------------------------------------------------
 * Creator's name and email: Christian Livengood, livengoodc@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Oct 31, 2019
 * ---------------------------------------------------------------------------
 */

package zork;


/**
 * The Player class
 *
 * <hr>
 * Date created: Oct 31, 2019
 * <hr>
 * @author Christian Livengood, Benjamin Pottinger
 */
public class Player extends Character
{
	private static final int PLAYER_HEALTH = 100;
	private static final int PLAYER_DAMAGE = 5;
	private static int playerPositionX = 0;
	private static int playerPositionY = 0;
	



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
	public Player(String name,int health, int damage, Weapon weapon) throws Exception
	{
		super(name, PLAYER_HEALTH, PLAYER_DAMAGE, weapon);
	}
	
	
	/**
	 * Default Constructor        
	 *
	 * <hr>
	 * Date created: Oct 31, 2019 
	 *
	 * 
	 */
	public Player() throws Exception
	{
		super();
	}
	
	/**
	 * Constructor to set the name of the Player       
	 *
	 * <hr>
	 * Date created: Oct 31, 2019 
	 *
	 * 
	 */
	public Player(String name) throws Exception
	{
		super(name, PLAYER_HEALTH, PLAYER_DAMAGE, null);
	}
	
	/**
	 * @return playerPasitionX
	 */
	public static int getPlayerPasitionX ( )
	{
		return playerPositionX;
	}


	
	/**
	 * @param playerPasitionX the playerPasitionX to set
	 */
	public void setPlayerPasitionX (int playerPasitionX)
	{
		Player.playerPositionX = playerPasitionX;
	}


	
	/**
	 * @return playerPasitionY
	 */
	public static int getPlayerPasitionY ( )
	{
		return playerPositionY;
	}


	
	/**
	 * @param playerPasitionY the playerPasitionY to set
	 */
	public void setPlayerPasitionY (int playerPasitionY)
	{
		Player.playerPositionY = playerPasitionY;
	}

	/**
	 * @return playerPasition
	 */
	public static int getPlayerPasition ( )
	{
		return playerPositionX + playerPositionY;
	}
	
}
