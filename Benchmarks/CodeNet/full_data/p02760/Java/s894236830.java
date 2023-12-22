
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int A[][] = new int[3][3];
		boolean c[][] = new boolean[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				A[i][j]=sc.nextInt();
			}
		}
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int b = sc.nextInt();
			for(int j=0; j<3; j++) {
				for(int k=0; k<3; k++) {
					if(A[j][k]==b) {
						c[j][k]=true;
					}
				}
			}
		}
		boolean ans = false;
		for(int i=0; i<3; i++) {
			if(c[i][0] && c[i][1] && c[i][2]) {
				ans = true;
			}
		}
		for(int i=0; i<3; i++) {
			if(c[0][i] && c[1][i] && c[2][i]) {
				ans = true;
			}
		}
		if(c[0][0] && c[1][1] && c[2][2]) {
			ans = true;
		}
		if(c[0][2] && c[1][1] && c[2][0]) {
			ans = true;
		}
		if(ans) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}
}
