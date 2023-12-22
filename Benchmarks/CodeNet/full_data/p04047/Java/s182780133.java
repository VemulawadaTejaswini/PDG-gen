import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n*2];
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt(); 
		}
		Arrays.sort(a);
		int min = 0;
		for (int i = 0; i < a.length; i+=2) {
			min += Math.min(a[i],a[i+1]);
		}
		System.out.println(min);
 	}

}
