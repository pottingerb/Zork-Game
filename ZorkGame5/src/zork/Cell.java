/**
 * ---------------------------------------------------------------------------
 * File name: Cell.java
 * Project name: Zork
 * ---------------------------------------------------------------------------
 * Creator's name and email: Benjamin Pottinger, pottingerb@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Oct 31, 2019
 * ---------------------------------------------------------------------------
 */

package zork;

import java.util.Random;

/**
 * The Cell class represents a single "room" in the array
 *
 * <hr>
 * Date created: Oct 31, 2019
 * <hr>
 * @author Benjamin Pottinger, Christian Livengood
 */
public class Cell {
	
	Random random = new Random();
	
	private Monster monster;
	private Weapon weapon;
	private Player player;
	
	private boolean playerInCell = false;
	private boolean monsterInCell = false;
	private boolean weaponInCell = false;
	
	public Cell ( ) 
	{
		super();
	}
	
	
	/**
	 * Constructor for the player and to set the player in cell flag       
	 *
	 * <hr>
	 * Date created: Nov 4, 2019 
	 *
	 * 
	 * @param player
	 */
	public Cell(Player player) {
		this.player = player;
		playerInCell = true;
	}
	
	/**
	 * The combat method       
	 *
	 * <hr>
	 * Date created: Nov 4, 2019
	 *
	 * <hr>
	 * @return
	 * @throws Exception
	 */
	public String combat() throws Exception {
		String deathMessage = "";
		
		
		while(player.getHealth() > 0 && monster.getHealth() > 0) {
			if(random.nextInt (10000) > 1000)//the chance to hit/miss for the player
			{
				monster.setHealth (monster.getHealth() - player.getDamage());
				deathMessage += player.getName() + " strikes at the " + monster.getName() + " dealing " + player.getDamage() + " damage. " + "\n";
				deathMessage += monster.getName ( ) + " was hit: points = " + monster.getHealth() + "\n";
			}
			else
			{
				deathMessage += player.getName ( ) + " missed.\n";
			}
			
			if(random.nextInt (10000) > 2000)//the chance to hit/miss for the monster
			{
				player.setHealth (player.getHealth() - monster.getDamage());
				deathMessage += monster.getName() + " strikes at the " + player.getName() + " dealing " + monster.getDamage() + " damage. " + "\n";
				deathMessage += player.getName ( ) + " was hit: points = " + player.getHealth() + "\n";
			}
			else
			{
				deathMessage += monster.getName ( ) + " missed.\n";
			}
		}
		player.setHealth(0);
		
		System.out.println("player.getHealth() = " + player.getHealth());
		if(player.getHealth() <= 0) {
			deathMessage += player.getName ( ) +" is dead\n";
		}
		if(monster.getHealth() <= 0) {
			deathMessage += "The " + monster.getName ( ) + " is dead\n";
			monster = null;
			isMonsterInCell(false);
		}
		
		return deathMessage;
	}
	
	
	/**
	 * this is a setter and getter for the player in cell flag for the dungeon class         
	 *
	 * <hr>
	 * Date created: Nov 4, 2019
	 *
	 * <hr>
	 * @param playerInCell
	 * @return
	 */
	public boolean isPlayerInCell(Boolean playerInCell) {
		this.playerInCell = playerInCell;
		return playerInCell;
	}
	
	
	/**
	 * this is a setter and getter for the player in cell flag for the dungeon class       
	 *
	 * <hr>
	 * Date created: Nov 4, 2019
	 *
	 * <hr>
	 * @param monsterInCell
	 * @return
	 */
	public boolean isMonsterInCell(Boolean monsterInCell) {
		this.monsterInCell = monsterInCell;
		return monsterInCell;
	}
	
	
	
	/**
	 * this is a setter and getter for the weapon in cell flag for the dungeon class       
	 *
	 * <hr>
	 * Date created: Nov 4, 2019
	 *
	 * <hr>
	 * @param weaponInCell
	 * @return
	 */
	public boolean isWeaponInCell(Boolean weaponInCell) {
		this.weaponInCell = weaponInCell;
		return weaponInCell;
	}
	
	/**
	 * this is the getter for the weapon in cell flag for the dungeon class       
	 *
	 * <hr>
	 * Date created: Nov 4, 2019
	 *
	 * <hr>
	 * @param weaponInCell
	 * @return
	 */
	public boolean isWeaponInCell()
	{
		return weaponInCell;
	}
	
	
	
	/**
	 * this is a  getter for the monster in cell flag for the dungeon class       
	 *
	 * <hr>
	 * Date created: Nov 4, 2019
	 *
	 * <hr>
	 * @return
	 */
	public boolean isMonsterInCell() {
		return monsterInCell;
	}
	
	
	
	/**
	 * this is a getter for the player in cell flag for the dungeon class      
	 *
	 * <hr>
	 * Date created: Nov 4, 2019
	 *
	 * <hr>
	 * @return
	 */
	public boolean isPlayerInCell() {
		return playerInCell;
	}
	

	/**
	 * this is a getter for the monster  
	 *
	 * <hr>
	 * Date created: Nov 4, 2019
	 *
	 * <hr>
	 * @return
	 */
	public Monster getMonster() {
		return monster;
	}

	
	/**
	 *  this is a setter for the monster   
	 *
	 * <hr>
	 * Date created: Nov 4, 2019
	 *
	 * <hr>
	 * @param monster
	 */
	public void setMonster(Monster monster) {
		this.monster = monster;
	}
	
	
	/**
	 * this is a getter for the weapon       
	 *
	 * <hr>
	 * Date created: Nov 4, 2019
	 *
	 * <hr>
	 * @return
	 */
	public Weapon getWeapon() {
		return weapon;
	}

	/**
	 * setter for weapon       
	 *
	 * <hr>
	 * Date created: Nov 4, 2019
	 *
	 * <hr>
	 * @param weapon
	 */
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	/**
	 * getter for player       
	 *
	 * <hr>
	 * Date created: Nov 4, 2019
	 *
	 * <hr>
	 * @return
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * setter for player         
	 *
	 * <hr>
	 * Date created: Nov 4, 2019
	 *
	 * <hr>
	 * @param player
	 */
	public void setPlayer(Player player) {
		this.player = player;
	}

	/**
	 * will display a cell and anything else that might be in it       
	 *
	 * <hr>
	 * Date created: Oct 31, 2019 
	 *
	 * <hr>
	 * @return
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String cell = "";
		if(playerInCell == true)
			cell += player.charReturn ( );
		if(monsterInCell == true)
			cell += monster.charReturn ( );
		if(weaponInCell == true)
			cell += weapon.charReturn ( );
			
		String border;
		
		if(cell.length() == 0) {
			border = "____";
		} else if(cell.length() == 1) {
			border = "___";
		} else if(cell.length() == 2) {
			border = "__";
		} else if(cell.length() == 3) {
			border = "_";
		} else {
			border = "";
		}
		

		return "|" + cell + border + "|";
	}
	
	
	/**
	 * This will check to see if there is a weapon in the room, then take the answer from the driver to set the weapon   
	 *
	 * <hr>
	 * Date created: Nov 5, 2019
	 *
	 * <hr>
	 * @param yesNo
	 * @param weapon 
	 * @throws Exception
	 */
	public void weaponQustion(String yesNo, Weapon weapon) throws Exception
	{
		if(weaponInCell)
		{
			if(yesNo.toUpperCase ( ).equalsIgnoreCase ("YES"))
			{
				player.setWeapon(weapon);
				weaponInCell = false;
				System.out.println("");
			}
		}
		
	}
}
