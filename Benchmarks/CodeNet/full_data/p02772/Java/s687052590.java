import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean approved = true;
		for(int i = 0; i < n ; i++) {
			int val = sc.nextInt();
			if(val % 2 == 0) {
				if(val % 3 == 0 || val % 5 == 0) {
					continue;
				}else {
					approved = false;
					break;
				}
			}
		}
		sc.close();
		if(approved) {
			System.out.println("APPROVED");
		}else {
			System.out.println("DENIED");
		}
	}

}
