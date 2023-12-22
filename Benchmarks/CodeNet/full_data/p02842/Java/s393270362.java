
import java.util.Scanner;

public class Main {

	
	public static void main (String[] args)  {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = -1;
		for (int i=0;i<n;i++) {
			if ((int)(1.08*i)==n) {
				ans = i;
			}
		}
		
		System.out.println(ans>=0 ? ans : ":(");
	}
}
