import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int max = sc.nextInt() + 1;
		int[] facs = new int[max];

		for (int i = 2; i < max; ++i) {
		    for (int j = i; j < max; j += i) {
		        facs[j]++;
		    }
		}
		int count = 0;
		for (int i = 0; i < max; ++i)
		    if (facs[i] == 7 && i%2 == 1)//1 is a factor of all number so check for count 7
		        count++;
		System.out.println(count);

	}

}
