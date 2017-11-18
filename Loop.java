
public class Loop {

	public static void main(String[] args) {
		// Test
		Barbarian jake = new Barbarian("Jake");
		Paladin vince = new Paladin("Vince");
		System.out.println(vince.getMana());
		vince.heal();
		jake.leap();
		System.out.println(jake);

	}

}
