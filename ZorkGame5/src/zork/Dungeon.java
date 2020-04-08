/**
 * ---------------------------------------------------------------------------
 * File name: Dungeon.java
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
 * The Dungeon class creates an array of cell objects
 *
 * Date created: Oct 31, 2019
 * @author Benjamin Pottinger, Christian Livengood
 */
public class Dungeon {
	
	private int currentX = 0;
	private int currentY = 0;
	private int row = 0;
	private int col = 0;
	private Player player;
	Sword sword;
	Stick stick;
	
	private final Cell[][] dungeon = new Cell[4][4];
	
	/**
	 * A parameterized constructor in which the cells are initialized with random characters and weapons, and the player is set in his starting position.
	 *
	 * Date created: Oct 31, 2019
	 * @param player - The player object that the user controls
	 */
	public Dungeon(Player player) throws Exception {
		this.player = player;
		
		for( row = 0; row < dungeon.length; row++) { // iterates through row
			for( col = 0; col < dungeon.length; col++) { // interates through col
				
				dungeon[row][col] = new Cell();
				
				Random rand = new Random(); 
				int monsterSpawn = rand.nextInt(5); // random value for monster spawn
				
				if(monsterSpawn == 0) { // if random produces a value of 0, initialize monster in current cell instance
					Goblin goblin = new Goblin();
					Orc orc = new Orc();
					Zombie zombie = new Zombie();
					Medusa medusa = new Medusa();
					sword = new Sword();
					stick = new Stick();
					
					int monsterNum = rand.nextInt (4) + 1;
					
					switch(monsterNum) {
						case 1:
							dungeon[row][col].setMonster(goblin);
																	//this is the code for a random monster and weapons
							break;
						case 2:
							dungeon[row][col].setMonster(orc);
							break;
						case 3:
							dungeon[row][col].setMonster(zombie);
							break;
						case 4:
							dungeon[row][col].setMonster(medusa);
							break;
					}
					
					int weaponNum = rand.nextInt (2) + 1;
					
					switch(weaponNum)
					{
						case 1:
							dungeon[row][col].setWeapon (sword);
							dungeon[row][col].isWeaponInCell (true);
							break;
						//case 2:
							//dungeon[row][col].setWeapon (stick);
							//dungeon[row][col].isWeaponInCell (true);
							//break;
					}
					

					
					dungeon[row][col].isMonsterInCell(true); //sets spawn condition to true
				}
				
			}	
		}
		dungeon[0][0] = new Cell(player);
	}
	

	/**
	 * This method is the player movement method.
	 *
	 * Date created: Oct 31, 2019
	 */
	public String movement(String playerMovement) throws Exception {
		
		String movementMessage = "";
		
		dungeon[currentX][currentY].setPlayer(null); // removes player reference
		dungeon[currentX][currentY].isPlayerInCell(false); // player spawn condition false, will be set to true in the cell he moves into
		
		try
		{
			if (playerMovement.toUpperCase().equalsIgnoreCase("GO NORTH")) {
				if (currentX < dungeon.length - 1 || currentX < 0) { //verification x
					currentX--;
					player.setPlayerPasitionX (currentX); //this was just for testing and tracking
					if(currentX < 0)
					{
						currentX++; //This is to reset the currentX to it's last int
					}
				}
			} else if (playerMovement.toUpperCase().equalsIgnoreCase("GO SOUTH")) {
				if (currentX < dungeon.length - 1 || currentX > 0) { //verification x
					currentX++;
					player.setPlayerPasitionX (currentX); //this was just for testing and tracking
					if(currentX < 0)
					{
						currentX--; //This is to reset the currentX to it's last int
					}
				}
			} else if (playerMovement.toUpperCase().equalsIgnoreCase("GO EAST")) {
				if (currentY < dungeon.length - 1 || currentY < 0) { //verification y
					currentY++;
					player.setPlayerPasitionY (currentY); //this was just for testing and tracking
					if(currentY < 0)
					{
						currentY--; //This is to reset the currentX to it's last int
					}
				}
			} else if (playerMovement.toUpperCase().equalsIgnoreCase("GO WEST")) {
				if (currentY < dungeon.length - 1 || currentY > 0) { //verification y
					currentY--; 
					player.setPlayerPasitionY (currentY); //this was just for testing and tracking
					if(currentY < 0)
					{
						currentY++; //This is to reset the currentX to it's last int
					}
				}
			}
			else {
				dungeon[currentX][currentY].setPlayer(player); // adds player reference
				dungeon[currentX][currentY].isPlayerInCell(true); // player spawn condition true
				return "I do not know what you mean.\n";
			}
			
			dungeon[currentX][currentY].setPlayer(player); // adds player reference
			dungeon[currentX][currentY].isPlayerInCell(true); // player spawn condition true
			
			if(dungeon[currentX][currentY].isMonsterInCell() && dungeon[currentX][currentY].isPlayerInCell()) { // if both player and monster are in the same cell
				movementMessage += dungeon[currentX][currentY].combat(); // combat method in cell instance
			}
			
			if(movementMessage.equals(null)) { // if no combat occurred, then message is simply "nothing happened here"
				movementMessage = "Nothing happened here.";
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		return movementMessage;
	}
	
	/**
	 * This is to tell the while loop in the driver the last cell, which is the end game cell
	 *
	 * Date created: Nov 3, 2019
	 *
	 * @return dungeonS - The representation of the entire "dungeon," or array of cells
	 * @see java.lang.Object#toString()
	 */
	public int lastCell()
	{
		return (row - 1) + (col - 1);  //Because the array starting cell is [0,0], we cannot have the row and col be 4 and 4
	}

	/**
	 * The toString override for the Dungeon
	 *
	 * Date created: Oct 31, 2019
	 *
	 * @return dungeonS - The representation of the entire "dungeon," or array of cells
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		String dungeonS = "";

		for (int row = 0; row < dungeon.length; row++) {
			for (int col = 0; col < dungeon[row].length; col++) {
				dungeonS += dungeon[row][col];
			}

			dungeonS += "\n";
		}

		return dungeonS;
	}

	
	/**
	 * returns the current cell
	 *
	 *
	 * <hr>
	 * Date created: Nov 5, 2019
	 *
	 * <hr>
	 * @return
	 */
	public Cell getCell()
	{
		return dungeon[currentX][currentY];
	}

}
