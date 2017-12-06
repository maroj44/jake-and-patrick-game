import java.text.DecimalFormat;
import java.util.Scanner;

public class TextLab07v100 {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

        System.out.print("Enter the odd# size of the Magic Square -->  ");
        int size = input.nextInt();
        MagicSquare magic = new MagicSquare(size);

        magic.computeMagicSquare();
        magic.displayMagicSquare();
		magic.checkRows();           // for 100 & 110 Point Version Only
		magic.checkColumns();		 // for 100 & 110 Point Version Only
//		magic.checkDiagonals();	 	 // for 100 & 110 Point Version Only
 		System.out.println();
	}
}

class MagicSquare
{
	private int size;
	private int magic[][];
	private DecimalFormat output;

	public MagicSquare(int s)
	{
		size = s;
		magic = new int[size][size];
		output = new DecimalFormat("000");
	}

	public void computeMagicSquare()
	{
		int rows = 0;
		int cols = (size - 1) / 2;
		int ss = (int) Math.pow(size, 2);
		for(int i = 1; i <= ss; i++) {
			magic[rows][cols] = i;
			
			if(i % size == 0 && i < ss) {
				rows++;
			} else if(i < ss) {
				rows--;
				cols++;
				if(rows < 0) {
					rows = size - 1;
				}
				if(cols > size - 1) {
					cols = 0;
				}
			}
		}



	}

	public void displayMagicSquare()
	{
		System.out.println();
		System.out.println(size + "x" + size + " Magic Square");
		System.out.println("==================");
		System.out.println();

		for(int[] r: magic) {
			for(int value: r) {
				System.out.print(output.format(value) + " ");	
			}
			System.out.println();
		}
		




	}

	public void checkRows()
	{
		System.out.println();
		System.out.println("Checking Rows");
		System.out.println("=============");
		System.out.println();

		int count = 0;
		for(int[] r: magic) {
			for(int value: r) {
				count += value;
			}
			System.out.print(count + " ");
			count = 0;
		}
		

	}

	public void checkColumns()
	{
		System.out.println();
		System.out.println("Checking Columns");
		System.out.println("================");
		System.out.println();

		int count = 0;
		for(int col = 0; col < size; col++) {
			for(int row = 0; row < size; row ++) {
				count += magic[row][col]; 
			}
			System.out.print(count + " ");
			count = 0;
		}
	}

	public void checkDiagonals()
	{
		System.out.println();
		System.out.println("Checking Diagonals");
		System.out.println("==================");
		System.out.println();
		
		// TODO make the loop rows-- cols++ and vice versa


	}
	
}
