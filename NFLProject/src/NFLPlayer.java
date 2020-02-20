/*James-Ryan Stampley
 * The following work is done by James-Ryan Stampley and no one else can take credit for it
 */

public abstract class NFLPlayer {
	
	//7 private properties relating to any player, regardless of position
	
	private String name, college, position, type;
	private int age, height, weight, playerNumber;	

	//CONSTRUCTOR with no arguments
		public NFLPlayer() {
		 
		}
		
		//parameterized CONSTRUCTOR with all properties as arguments
		public NFLPlayer(String name, String college, String position, int playerNumber,
				 		 int age, int height, int weight) {
			this.name = name; 
			this.college = college; 
			this.position = position;
			this.playerNumber = playerNumber; 
			this.age = age;
			this.height = height;
			this.weight = weight; 
			
				}
	//toString method 
	public String toString() {
		String str = " Player name: " + getName();
		str += "\n Player's college: " + getCollege();
		str += "\n Player position: " + getPosition();
		str += "\n Player number: " + getPlayerNumber();
		str += "\n Player's age: " + getAge();
		str += "\n Player's height: " + getHeight();
		return str;
	}
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}

