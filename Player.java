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
	
	// Human class constructor
	public Human(String name) {
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
	}
	
	// methods
	
		
}

class Paladin extends Human {

	// Paladin class constructor
	public Paladin(String name) {
		super(name);
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
	

}