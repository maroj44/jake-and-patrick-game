
public class TextLab06v100 {

	
	
	public static void main(String[] args) {
		boolean primes[] = new boolean[101];
		
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
		
		for(int index = 2; index < primes.length; index++) {
			
			if(primes[index]) {
				System.out.print(index + " ");
			}
		}
		
	}
}
