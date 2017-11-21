public class Player {
	
	// to string method
	@Override
	public String toString() {
		return "Player [name=" + name + ", experience=" + experience
				+ ", level=" + level + ", strength=" + strength + ", stamina="
				+ stamina + ", speed=" + speed + ", magic=" + magic
				+ ", healthMax=" + healthMax + ", health=" + health
				+ ", manaMax=" + manaMax + ", mana=" + mana;
	}
	// Player attributes
	protected String name;
	protected int experience;
	protected int level;
	protected int strength;
	protected int stamina;
	protected int speed;
	protected int magic;
	protected int healthMax;
	protected int health;
	protected int manaMax;
	protected int mana;

	// Player class constructor
	public Player(String name) {
		this.name = name;
		this.experience = 0;
		this.level = 0;
		
		// total starting == 150; no more than 60 in any starting value
		this.strength = 0;
		this.stamina = 0;
		this.speed = 0;
		this.magic = 0; 
		
		// total starting == 100;
		this.healthMax = 0;
		this.health = this.healthMax;
		this.manaMax = 0;
		this.mana = this.manaMax;
	}
	
	// get methods
	public String getName() { return this.name; }
	public int getExperience() { return this.experience; }
	public int getLevel() { return this.level; }
	public int getStrength() { return this.strength; }
	public int getStamina() { return this.stamina; }
	public int getSpeed() { return this.stamina; }
	public int getMagic() { return this.magic; }
	public int getHealthMax() { return this.healthMax; }
	public int getHealth() { return this.health; }
	public int getManaMax() { return this.manaMax; }
	public int getMana() { return this.mana; }
	
	// TODO set methods
	public void setName(String name) { this.name = name; }
	public void setExperience(int experience) { this.experience = experience;}
	public void setLevel(int level) { this.level = level; }
	public void setStrength(int strength) { this.strength = strength; }
	public void setStamina(int stamina) { this.stamina = stamina; }
	public void setSpeed(int speed) { this.speed = speed; }
	public void setMagic(int magic) { this.magic = magic; }
	public void setHealthMax(int healthMax) { this.healthMax = healthMax; }
	public void setHealth(int health) { this.health = health; }
	public void setManaMax(int manaMax) { this.manaMax = manaMax; }
	public void setMana(int mana) { this.mana = mana; }
	
	
	//General Player action methods
	
	
	
}

//  Character types

class Barbarian extends Player {

	// Barbarian class Constructor
	public Barbarian(String name) {
		super(name);
		this.experience = 0;
		this.level = 0;
		
		
		this.strength = 60;
		this.stamina = 40;
		this.speed = 35;
		this.magic = 15;
		
		
		this.healthMax = 80;
		this.health = this.healthMax;
		this.manaMax = 20;
		this.mana = this.manaMax;
		
	}
	
	// Barbarian-specific actions
	public void leap() {
		// actions should depend on the player's stats
		if(this.level >= 2) {
			System.out.println("You leaped");
		}
		else
			System.out.println("You must be at least level 2 to use Leap.");
	}
	
	
}

class Sorcerer extends Player {
	
	// Sorcerer class constructor
	public Sorcerer(String name) {
		super(name);
		this.experience = 0;
		this.level = 0;
		
		
		this.strength = 15;
		this.stamina = 40;
		this.speed = 35;
		this.magic = 60;
		
		
		this.healthMax = 20;
		this.health = this.healthMax;
		this.manaMax = 80;
		this.mana = this.manaMax;
		
		
	}
	
	// Sorcerer-specific actions
	public void bolt() {
		if(level >= 2) {
			System.out.println("You cast bolt on your enemy.");
			// damage dependent on enemy's resistance
			// call a method that returns the health of the enemy
		}
		else
			System.out.println("You must be at least level 2 to use Bolt.");
	}
}

class Human extends Player {
	
	protected String address;
	protected boolean isEmployed;
	protected String jobTitle;
	protected boolean isMarried;
	protected String gender;
	protected String religion;
	protected int age;
	protected int height;
	protected int weight;
	
	// Human class constructor
	public Human(String name, String gender, int age, int height, int weight) {
		super(name);
		this.experience = 0;
		this.level = 0;
		
		
		this.strength = 15;
		this.stamina = 10;
		this.speed = 10;
		this.magic = 0;
		
		
		this.healthMax = 40;
		this.health = this.healthMax;
		this.manaMax = 0;
		this.mana = this.manaMax;
		
			
		
		this.gender = gender;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}


	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	// methods
	public void sleep(){
			System.out.println("You are sleeping.");
		}
		
}

class Paladin extends Human {
	
	
	// Paladin class constructor
	public Paladin(String name, String gender, int age, int height, int weight) {
		super(name, gender, age, height, weight);
		this.experience = 0;
		this.level = 0;
		
		
		this.strength = 40;
		this.stamina = 60;
		this.speed = 15;
		this.magic = 35;
		
		
		this.healthMax = 70;
		this.health = this.healthMax;
		this.manaMax = 30;
		this.mana = this.manaMax;
		
		
	}
	
	public void heal() {
		if(level >= 2) {
			System.out.println("You are now healed.");
		}
		else
			System.out.println("You must be at least level 2 to use Heal.");
	}
	


// TODO fix constructors and reorder
	public void smash() {
	 		if (level >= 3) 
	 			System.out.println("You smashed your enemies.");
	 		else
	 			System.out.println("You must be atleast level 3 to use Smash.");
	 	}

}
	 class Archer extends Human{
	 	
		 public Archer(String name, String gender, int age, int height, int weight){
	 		super(name, gender, age, height, weight);
	 	this.experience = 0;
	 		this.level = 0;
	 		
	 		
	 		this.strength = 20;
	 		this.stamina = 20;
	 		this.speed = 10;
	 		this.magic = 0;
	 		
	 		
	 		this.healthMax = 35;
	 		this.health = this.healthMax;
	 		this.manaMax = 0;
	 		this.mana = this.manaMax;
	 		
	 	}
	 	
	 	public void rangeAttack(){
	 		if(level >= 1){
	 			System.out.println("You shot your bow.");
	 		}
	 		else
	 			System.out.println("You must be atleast level 1 to use Range Attack.");
	 			
	 	}
	 	
	 class Swordsman extends Human{
	 	
	 	public Swordsman(String name, String gender, int age, int height, int weight){
	 		super(name, gender, age, height, weight);
	 		this.experience = 0;
	 		this.level = 0;
	 		
	 		
	 		this.strength = 30;
	 		this.stamina = 5;
	 		this.speed = 10;
	 		this.magic = 0;
	 		
	 		
	 		this.healthMax = 50;
	 		this.health = this.healthMax;
	 		this.manaMax = 0;
	 		this.mana = this.manaMax;
	 	}
	 	public void charge(){
	 		if(level >= 3){
	 			System.out.println("You used charge. ");
	 		}
	 			System.out.println("You must atleast level 3 to use charge.");
	 	}
	  	
	 	
	 }
 	
	 }