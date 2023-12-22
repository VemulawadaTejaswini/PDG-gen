import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
	public static void main(String args[]){
		    Scanner sc = new Scanner(System.in);	
			
			int n = sc.nextInt();
			int[] ar = new int[n];
			int sum = 0;
			for (int i = 0; i < n; i++) {
				ar[i] = sc.nextInt();
			}
			Arrays.sort(ar);
			ar[n-1] /= 2;
			for (int i = 0; i < n; i++) {
				sum += ar[i];
			}
			System.out.println(sum);

}