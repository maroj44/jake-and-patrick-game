import java.applet.*;
import java.awt.*;
import java.util.Scanner;


public class Test extends Applet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Scanner input;

	public void paint(Graphics p) { 
		super.setSize(1400, 800);
		Graphics2D g = (Graphics2D) p;
		// images
		Toolkit toolkit =(Toolkit.getDefaultToolkit());
		Image player = toolkit.getImage("assets/player.png");
		Image human = toolkit.getImage("assets/human.png");
		Image sorcerer = toolkit.getImage("assets/sorcerer.png");
		Image barbarian = toolkit.getImage("assets/barbarian.png");
		Image paladin = toolkit.getImage("assets/paladin.png");
		Image archer = toolkit.getImage("assets/archer.png");
		
		
		input = new Scanner(System.in);
		
		// objects
		
		// attributes
		String name;
		int xPos;
		int yPos;
		int width;
		int height;
		String gender;
		int age;
		int weight;
		
		// objects
		Player billie = new Player("Billie", 10, 800, 100, 100);
		g.drawImage(player, 10, 800, 100, 100, this);
		
/*		System.out.println("CHARACTER CREATOR v1.0");
		// player creator
		
		System.out.println("Creating... PLAYER");
		System.out.println("Enter name: ");
		name = input.nextLine();
		System.out.println("Enter distance from the left: ");
		xPos = input.nextInt();
		System.out.println("Enter position above ground: ");
		yPos = 800 - input.nextInt();
		System.out.println("Enter character width: ");
		width = input.nextInt();
		System.out.println("Enter character height: ");
		height = input.nextInt();
		Player user = new Player(name, xPos, yPos, width, height);
		user.setLevel(4);
		g.drawImage(player, user.xPos, user.yPos, user.width, user.height, this);
		
//		human creator
		System.out.println("Creating... HUMAN");
		System.out.println("Enter name: ");
		name = input.nextLine();
		System.out.println("Enter distance from the left: ");
		xPos = input.nextInt();
		System.out.println("Enter position above ground: ");
		yPos = 800 - input.nextInt();
		System.out.println("Enter character width: ");
		width = input.nextInt();
		System.out.println("Enter character height: ");
		height = input.nextInt();
		System.out.println("Enter gender: ");
		gender = input.nextLine();
		System.out.println("Enter age: ");
		age = input.nextInt();
		System.out.println("Enter weight: ");
		weight = input.nextInt();
		Human user1 = new Human(name, xPos, yPos, width, height, gender, age, weight);
		user1.setLevel(4);
		g.drawImage(human, xPos, yPos, width, height, this);
		
		// sorcerer creator
		System.out.println("Creating... SORCERER");
		System.out.println("Enter name: ");
		name = input.nextLine();
		System.out.println("Enter distance from the left: ");
		xPos = input.nextInt();
		System.out.println("Enter position above ground: ");
		yPos = 800 - input.nextInt();
		System.out.println("Enter character width: ");
		width = input.nextInt();
		System.out.println("Enter character height: ");
		height = input.nextInt();
		Sorcerer user2 = new Sorcerer(name, xPos, yPos, width, height);
		user2.setLevel(4);
		g.drawImage(sorcerer, xPos, yPos, width, height, this);
		g.finalize();
		
		// barbarian creator
		System.out.println("Creating... BARBARIAN");
		System.out.println("Enter name: ");
		name = input.nextLine();
		System.out.println("Enter distance from the left: ");
		xPos = input.nextInt();
		System.out.println("Enter position above ground: ");
		yPos = 800 - input.nextInt();
		System.out.println("Enter character width: ");
		width = input.nextInt();
		System.out.println("Enter character height: ");
		height = input.nextInt();
		Barbarian user3 = new Barbarian(name, xPos, yPos, width, height);
		user3.setLevel(4);
		g.drawImage(barbarian, xPos, yPos, width, height, this);
		g.finalize();
		
		// paladin creator
		System.out.println("Creating... PALADIN");
		System.out.println("Enter name: ");
		name = input.nextLine();
		System.out.println("Enter distance from the left: ");
		xPos = input.nextInt();
		System.out.println("Enter position above ground: ");
		yPos = 800 - input.nextInt();
		System.out.println("Enter character width: ");
		width = input.nextInt();
		System.out.println("Enter character height: ");
		height = input.nextInt();
		System.out.println("Enter gender: ");
		gender = input.nextLine();
		System.out.println("Enter age: ");
		age = input.nextInt();
		System.out.println("Enter weight: ");
		weight = input.nextInt();
		Paladin user4 = new Paladin(name, xPos, yPos, width, height, gender, age, weight);
		user4.setLevel(4);
		g.drawImage(paladin, xPos, yPos, width, height, this);
		g.finalize();
		
		// archer creator
		System.out.println("Creating... ARCHER");
		System.out.println("Enter name: ");
		name = input.nextLine();
		System.out.println("Enter distance from the left: ");
		xPos = input.nextInt();
		System.out.println("Enter position above ground: ");
		yPos = 800 - input.nextInt();
		System.out.println("Enter character width: ");
		width = input.nextInt();
		System.out.println("Enter character height: ");
		height = input.nextInt();
		System.out.println("Enter gender: ");
		gender = input.nextLine();
		System.out.println("Enter age: ");
		age = input.nextInt();
		System.out.println("Enter weight: ");
		weight = input.nextInt();
		Archer user5 = new Archer(name, xPos, yPos, width, height, gender, age, weight);
		user5.setLevel(4);
		g.drawImage(archer, xPos, yPos, width, height, this);
		g.finalize();
*/		
		
		
/*		
		Graphics2D g = (Graphics2D) p;
		toolkit = Toolkit.getDefaultToolkit();
	    Image img1 = toolkit.getImage("assets/turkey.png");
	    g.drawImage(img1, xPos, yPos, width, height, this);
	    g.finalize();
	    
*/		
//		g.drawImage(player, user.xPos, user.yPos, user.width, user.height, this);
		
	}

}
