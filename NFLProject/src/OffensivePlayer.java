/*
 * The following work is all James-Ryan Stampley's, and no one else can take credit for it 
 */ 
 
public class OffensivePlayer extends NFLPlayer{

	//properties of Defensive player class
	private int completions, attempts, touchdowns, interceptions, totalYards;
	private double yardsPerPass; 
	
	
	//parameterized constructor
		public OffensivePlayer(int touchdowns, int interceptions, int completions, int attempts, int totalYards, double yardsPerPass) {
			
			this.touchdowns = touchdowns; 
			this.interceptions = interceptions;
			this.completions = completions;
			this.attempts = attempts; 
			this.totalYards = totalYards;
			this.yardsPerPass = yardsPerPass; 
			
		}
		//constructor with no arguments
		public OffensivePlayer() {
			
			
		}

	//toString method
	public String toString() {
		String str = "Offensive player: " + getName() + "\n";
		str += "On the year, " + getName() + " has " + getTouchdowns() + " touchdowns and " + getInterceptions() + " interceptions" + "\n";
		str += "Completions: " + getCompletions() + " Attempts: " + getAttempts() + "\n";
		str += getName() + " had " + getTotalYards() + " total yards in 2017, with an average of " + getYardsPerPass() + " yards per pass." + "\n";
		return str;
		
	}
	
	public int getCompletions() {
		return completions;
	}
	public void setCompletions(int completions) {
		this.completions = completions;
	}
	public int getAttempts() {
		return attempts;
	}
	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}
	public int getTouchdowns() {
		return touchdowns;
	}
	public void setTouchdowns(int touchdowns) {
		this.touchdowns = touchdowns;
	}
	public int getInterceptions() {
		return interceptions;
	}
	public void setInterceptions(int interceptions) {
		this.interceptions = interceptions;
	}
	public int getTotalYards() {
		return totalYards;
	}
	public void setTotalYards(int totalYards) {
		this.totalYards = totalYards;
	}
	public double getYardsPerPass() {
		return yardsPerPass;
	}
	public void setYardsPerPass(double yardsPerPass) {
		this.yardsPerPass = yardsPerPass;
	}
}