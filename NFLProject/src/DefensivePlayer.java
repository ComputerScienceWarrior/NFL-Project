/*
 * The following work is all James-Ryan Stampley's, and no one else can take credit for it 
 */ 
 
public class DefensivePlayer extends NFLPlayer{

	//properties of Defensive player class
	private double sacks, tackles, safeties, forcedFum;
	private int passesDefended, interceptions;
	
	
	//parameterized constructor
		public DefensivePlayer(double sacks, double tackles, double forcedFum, double safeties, int passesDefended, int interceptions) {
			
			this.sacks = sacks;
			this.tackles = tackles;
			this.forcedFum = forcedFum;
			this.safeties = safeties;
			this.passesDefended = passesDefended;
			this.interceptions = interceptions; 
		}
		//constructor with no arguments
		public DefensivePlayer() {
			
			
		}

	//toString method
	public String toString() {
		String str = "Defensive player: " + getName() + "\n";
		str += "Sacks on the year: " + getSacks() + "\n";
		str += "Tackles on the year: " + getTackles() + "\n";
		str += "Forced fumbles on the year: " + getForcedFum() + "\n";
		str += "Responsible for " + getSafeties() + " on the year." + "\n";
		str += "In total, he's defended " + getPassesDefended() + " passes." + "\n";
		str += "He has a total of " + getInterceptions() + " interceptions for the year." + "\n";
		return str;
		
	}
	public double getSacks() {
		return sacks;
	}

	public void setSacks(double sacks) {
		this.sacks = sacks;
	}

	public double getTackles() {
		return tackles;
	}

	public void setTackles(double tackles) {
		this.tackles = tackles;
	}

	public double getSafeties() {
		return safeties;
	}

	public void setSafties(double safeties) {
		this.safeties = safeties;
	}

	public double getForcedFum() {
		return forcedFum;
	}

	public void setForcedFum(double forcedFum) {
		this.forcedFum = forcedFum;
	}

	public int getPassesDefended() {
		return passesDefended;
	}

	public void setPassesDefended(int passesDefended) {
		this.passesDefended = passesDefended;
	}

	public int getInterceptions() {
		return interceptions;
	}

	public void setInterceptions(int interceptions) {
		this.interceptions = interceptions;
	}

}