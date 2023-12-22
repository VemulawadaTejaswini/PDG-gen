import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		boolean isApproved = true;
		for(int i = 0; i < n; i++) {
			int x = scan.nextInt();
			if(x % 2 == 0) {
				if(x % 3 == 0 || x % 5 == 0) continue;
			} else {
				continue;
			}
			isApproved = false;
		}
		if(isApproved) System.out.println("APPROVED");
		else System.out.println("DENIED");
		scan.close();
	}

}
