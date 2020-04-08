/**
 * ---------------------------------------------------------------------------
 * File name: GameManager.java
 * Project name: Zork
 * ---------------------------------------------------------------------------
 * Creator's name and email: Christian Livengood, livengoodc@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Oct 31, 2019
 * ---------------------------------------------------------------------------
 */

package zork;

import java.util.Scanner;


/**
 * The GameManager class is the driver of the class and runs the core game loop
 *
 * Date created: Oct 31, 2019
 * @author Christian Livengood, Benjamin Pottinger
 */
public class GameManager {

	/**
	 *The main method of the program, consisting entirely of method calls. It runs the printing of the banner and core game loop. 
	 *
	 * Date created: Oct 31, 2019
	 * @param args
	 */
	public static void main (String [ ] args) 
	{
		printBanner();
		gameLoop();
	}//end of main class

	
	
	/**
	 * Prints Zork banner to screen and credits creators
	 *
	 * Date created: Nov 6, 2019
	 */
	public static void printBanner() {
		System.out.println("==============================");
		System.out.println("|  ______          _         |");
		System.out.println("| |___  /         | |        |");
		System.out.println("|    / / ___  _ __| | __     |");
		System.out.println("|   / / / _ \\| '__| |/ /     |");
		System.out.println("|  / /_| (_) | |  |   <      |");
		System.out.println("| /_____\\___/|_|  |_|\\_\\     |");
		System.out.println("==============================");
		System.out.println("Welcome to the Zork game! A text-based RPG game made by Christian Livengood and Benjamin Pottinger.");
		System.out.println("");
	}
	
	/**
	 * Does the preparation for the game loop and executes the game loop for as long as the program is running
	 *
	 * Date created: Nov 6, 2019
	 */
	public static void gameLoop() {
		@SuppressWarnings("resource")
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the player's name.");

		try {
			Player player2 = new Player(kb.nextLine());
			Dungeon dungeon = new Dungeon(player2);

			System.out.println(dungeon.toString());

			while (Player.getPlayerPasition() != dungeon.lastCell()) { // checks if player is is last cell
				System.out.println("What direction would you like to go?");
				String dir = kb.nextLine();
				System.out.println(dungeon.movement(dir));
				if(player2.getHealth() <= 0) { // death conditions
					System.exit(0);
				}
				if (dungeon.getCell().isWeaponInCell() == true) { // weapon check, asks player if wants to use it
					System.out.println(
							"There is a " + dungeon.getCell().getWeapon() + " here. Do you wish to pick it up?");
					dungeon.getCell().weaponQustion(kb.nextLine(), dungeon.getCell().getWeapon());
				}
				System.out.println(dungeon.toString()); // print out dungeon 
			}
			if (player2.getHealth() > 0) {
				System.out.println("Congratulation! " + player2.getName() + " has suvived the dungeon!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}