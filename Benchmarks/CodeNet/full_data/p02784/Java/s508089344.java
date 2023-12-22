import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int h = scan.nextInt();
		int n = scan.nextInt();
		int a = 0;
		
		for(int i=0;i<n;i++) {
			a += scan.nextInt();
		}
		if(h <= a) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}


