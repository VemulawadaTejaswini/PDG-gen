import java.util.Scanner;
 
public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);

		Integer array[][] = new Integer[3][3];
		for(int i = 0;i < 3;i++) {
			for(int j = 0; j < 3; j++) {
				array[i][j] = scan.nextInt();
			}
		}
		int n = scan.nextInt();
		for(int k = 0; k < n; k++) {
			int num = scan.nextInt();
			for(int i = 0;i < 3; i++) {
				for(int j = 0; j < 3; j++) {		
					if(array[i][j].equals(num)) {
						array[i][j] = 0;
					}
				}
			}
		}
		
		for(int i = 0; i < 3; i++) {
			if(array[i][0] == 0 && array[i][1] == 0 && array[i][2] == 0) {
				System.out.println("Yes");
				return;
			}
			if(array[0][i] == 0 && array[1][i] == 0 && array[2][i] == 0) {
				System.out.println("Yes");
				return;
			}
		}
		// naname
		if(array[0][0] == 0 && array[1][1] == 0 && array[2][2] == 0) {
			System.out.println("Yes");
			return;
		}
		if(array[2][0] == 0 && array[1][1] == 0 && array[0][2] == 0) {
			System.out.println("Yes");
			return;
		}
		System.out.println("No");
	}
}