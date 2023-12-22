
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int g[][] = new int[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				g[i][j]=sc.nextInt();
			}
		}
		boolean ok = false;
		for(int i=0; i<=100; i++) {

			int a1=i;
			int b1=g[0][0]-a1;

			int b2=g[0][1]-a1;
			int b3=g[0][2]-a1;
			int a2=g[1][0]-b1;
			int a3=g[2][0]-b1;

			if( g[0][0] == a1+b1 &&
				g[0][1] == a1+b2 &&
				g[0][2] == a1+b3 &&
				g[1][0] == a2+b1 &&
				g[1][1] == a2+b2 &&
				g[1][2] == a2+b3 &&
				g[2][0] == a3+b1 &&
				g[2][1] == a3+b2 &&
				g[2][2] == a3+b3) {
				ok=true;
				break;
			}
		}
		if(ok)System.out.println("Yes");
		else System.out.println("No");
		sc.close();
	}
}
