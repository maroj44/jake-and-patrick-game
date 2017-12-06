import java.text.DecimalFormat;
import java.util.Scanner;

public class TextLab06v100 {

	public static void main(String args[])
	{
		// This main method needs additions for the 100 point version.
		Scanner input = new Scanner(System.in);
		System.out.println("\nTextLab06\n");
		System.out.println("Enter the primes upper bound ===>>  ");
		final int MAX = input.nextInt();
		boolean primes[];
		primes = new boolean[MAX];
		computePrimes(primes);
		displayPrimes(primes);
	}

	public static void computePrimes(boolean primes[])
	{
		System.out.println("\nCOMPUTING PRIME NUMBERS");
		
		for(int i = 2; i < primes.length; i ++)
		{
			primes[i] = true;
		}
		
		
		for(int index = 2; index < primes.length; index++) {
			
			if(primes[index] == true) {
				for(int index1 = index * 2; index1 < primes.length; index1 += index) {
					primes[index1] = false;
				}
			}
		}
	}

	public static void displayPrimes(boolean primes[])
	{
		DecimalFormat output = new DecimalFormat("0000");
		System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
		System.out.println();
		int count = 0;
		
		for(int index = 2; index < primes.length; index++) {
			
			if(primes[index]) {
				System.out.print(output.format(index) + " ");
				count++;
				if(count % 15 == 0) {
					System.out.println();
				}
			}
		}

	}
	
	
}
