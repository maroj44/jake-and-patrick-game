import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// Test
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		String gender = input.nextLine();
		int age = input.nextInt();
		int height = input.nextInt();
		int weight = input.nextInt();
		
		Swordsman user = new Swordsman(name, gender, age, height, weight);
		
		System.out.println(user);

		/*		Archer jimmy = new Archer("Jake", "Male", 16, 70, 146);
		jimmy.setName("Jimmy");
		System.out.println(jimmy.getName());
		jimmy.setLevel(4);
		jimmy.rangeAttack(); */
	}

}