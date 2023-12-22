import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[][] c = new int[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				c[i][j] = stdIn.nextInt();
			}
		}
		int s1 = c[0][0]-c[1][0];
		int s2 = c[0][1]-c[1][1];
		int s3 = c[0][2]-c[1][2];
		
		int s4 = c[1][0]-c[2][0];
		int s5 = c[1][1]-c[2][1];
		int s6 = c[1][2]-c[2][2];
		
		int s7 = c[0][0]-c[0][1];
		int s8 = c[1][0]-c[1][1];
		int s9 = c[2][0]-c[2][1];
		
		int s10 = c[0][1]-c[0][2];
		int s11 = c[1][1]-c[1][2];
		int s12 = c[2][1]-c[2][2];
		
		if(s1 == s2 && s2 == s3 && s4 == s5 && s5 == s6 && s7 == s8 && s8 == s9 && s10 == s11 && s11 == s12) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}

}