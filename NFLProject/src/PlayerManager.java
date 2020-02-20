import java.util.*;

public class PlayerManager {
	
	private static ArrayList<NFLPlayer> playerList = null;
	
	public PlayerManager() {
		//method for array list of players 
		setPlayerList(new ArrayList<>());
		createPlayers();
	}
	
	public static void createPlayers() {
		
		//create defensive players 
		DefensivePlayer bosa = new DefensivePlayer(12.5, 70, 4, 0, 1, 0);
		bosa.setName("Joey Bosa");
		DefensivePlayer ingram = new DefensivePlayer(10.5, 56, 1, 0, 1, 0);
		ingram.setName("Melvin Ingram");
		DefensivePlayer byard = new DefensivePlayer(0, 87, 0, 0, 16, 8);
		byard.setName("Kevin Byard");
		DefensivePlayer jordan = new DefensivePlayer(13, 62, 2, 0, 11, 1);
		jordan.setName("Cameron Jordan");
		DefensivePlayer weddle = new DefensivePlayer(1, 63, 2, 0, 8, 6);
		weddle.setName("Eric Weddle");
		DefensivePlayer bethea = new DefensivePlayer(1.0, 57, 1, 0, 9, 5);
		bethea.setName("Antoine Bethea");
		
		//create offensive players (int touchdowns, int interceptions, int completions, int attempts, int totalYards, double yardsPerPass)
		OffensivePlayer brady = new OffensivePlayer(32, 8, 385, 851, 4577, 7.9);
		brady.setName("Tom Brady");
		OffensivePlayer rivers = new OffensivePlayer(28, 10, 360, 575, 4515, 7.9);
		rivers.setName("Philip Rivers");
		OffensivePlayer stafford = new OffensivePlayer(29, 10, 371, 565, 4446, 7.9);
		stafford.setName("Matthew Stafford");
		OffensivePlayer brees = new OffensivePlayer(23, 8, 386, 536, 4334, 8.1);
		brees.setName("Drew Brees");
		OffensivePlayer smith = new OffensivePlayer(26, 5, 341, 505, 4042, 8.0);
		smith.setName("Alex Smith");
		OffensivePlayer ryan = new OffensivePlayer(20, 12, 342, 529, 4095, 7.7);
		ryan.setName("Matt Ryan");
		
		
		//insert add methods
		getPlayerList().add(bosa);
		getPlayerList().add(ingram);
		getPlayerList().add(byard);
		getPlayerList().add(jordan);
		getPlayerList().add(weddle);
		getPlayerList().add(bethea);
		getPlayerList().add(brady);
		getPlayerList().add(rivers);
		getPlayerList().add(stafford);
		getPlayerList().add(brees);
		getPlayerList().add(smith);
		getPlayerList().add(ryan);
		
		}
	
	//Driver method to display all players to the console
	public void driver() {
		for (NFLPlayer nflPlayer : getPlayerList() ) {
			System.out.println(nflPlayer.toString()) ;
		}
		
	}
	
	//toString method 
	public String toString() {
		String list = "";
		for (NFLPlayer n : getPlayerList())
			list += (n.getName() + " " + getPlayerList().indexOf(n) + "\n");
		return list;
	}
		
	public static void main(String []args) {
	 //object of this class
		PlayerManager test = new PlayerManager();

	 //test driver method
		test.driver();
		
	}

	public static ArrayList<NFLPlayer> getPlayerList() {
		return playerList;
	}

	public static void setPlayerList(ArrayList<NFLPlayer> playerList) {
		PlayerManager.playerList = playerList;
	}
	
}
