import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String args[]) throws InterruptedException {
		    Scanner sc = new Scanner(System.in);	
			
			int n = sc.nextInt();
			int[] loc = new int[n];
			Arrays.sort(loc);

			System.out.println(loc[n-1]-loc[0]);

		    sc.close(); }
}
