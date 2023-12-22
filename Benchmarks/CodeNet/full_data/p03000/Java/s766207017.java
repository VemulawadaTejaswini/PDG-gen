import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int z = 0;
		for(int i=0;i<n;i++) {
			z += sc.nextInt();
			if(z >x) {
				System.out.println(i+1);
				System.exit(0);
			}
			if(i==n-1) {
				System.out.println(i+2);
				System.exit(0);
			}
		}
	}

}
