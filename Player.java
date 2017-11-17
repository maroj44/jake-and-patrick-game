
public class Player {
	private String name;
	private int experience;
	private int level;
	private int strength;
	private int stamina;
	private int speed;
	private int magic;

	public Player(String name, int experience, int level, int strength, int stamina, int speed, int magic) {
		this.name = name;
		this.experience = experience;
		this.level = level;
		this.strength = strength;
		this.stamina = stamina;
		this.speed = speed;
		this.magic = magic;
	}
}

class Barbarian extends Player {

	public Barbarian(String name, int experience, int level, int strength, int stamina, int speed, int magic) {
		super(name, experience, level, strength, stamina, speed, magic);
	}
	
}