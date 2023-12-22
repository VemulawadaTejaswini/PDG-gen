import java.util.Scanner;

public class Main {

	static long[][] table;
	static final long UNK = -1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(), p = scn.nextInt();
	
		int[] a = new int[n];
		table = new long[n + 1][2]; //n%2 is 0 or 1
		for (int i = 0; i < n; i++) {
			a[i] = scn.nextInt();
			table[i][0] = UNK;
			table[i][1] = UNK;
		}
		
		System.out.println(find(a, n, 0, 0, p));
		// pt();
	}

	private static long find(int[] array, int length, int i, int mod, int p) {
		// TODO Auto-generated method stub
		//base case
		if (i == length) {
			if (mod != (p % 2))  return 0;
			else return 1; //%2 == p%2, +1 to ct
		}
		long r = UNK;
		if (table[i][mod] == UNK)
			r = find(array, length, i + 1, (mod+array[i]) %2, p) + 
				find(array, length, i+1, mod, p);
		else
			r = table[i][mod];
		
		table[i][mod] = r;
		
		return table[i][mod];
	}

	


	private static void pt() {
		// TODO Auto-generated method stub
		for (int i = 0; i < table.length;  i++) {
			for (int j = 0; j< table[i].length; j++)
				System.out.print(table[i][j] + " ");
			
			System.out.println();
		} 
			
		
	}
}
