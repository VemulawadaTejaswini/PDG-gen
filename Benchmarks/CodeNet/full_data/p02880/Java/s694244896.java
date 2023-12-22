import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean found = false;
		if(n==1) {
			System.out.print("Yes");
			found = true;
		}
		for(int i = 1;i<=9 && !found;i++) {
			if(n%i == 0) {
				for(int j = 2;j<=9;j++) {
					if(n/i % j == 0 && n/i<=9) {
						System.out.print("Yes");
						found = true;
						break;
					}
				}
			}
		}
		if(!found) {
			System.out.print("No");
		}
	}
}
