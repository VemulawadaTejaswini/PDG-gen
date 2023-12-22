import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner kbs = new Scanner(System.in);
		int n = kbs.nextInt();
		int[] a = new int[n];
		boolean found;
		
		for(int i = 0; i < n; i++) {
			a[i] = kbs.nextInt();
			if(a[i] % 2 == 0) {
				if(a[i] % 3 == 0 || a[i] % 5 == 0) {
					found = true;
				}
				else {
					found = false;
				}
			}
		}
		
		if(true) {
			System.out.println("APPROVED");
		}
		if(false) {
			System.out.println("DENIED");
		}
		
		kbs.close();
	}

}
