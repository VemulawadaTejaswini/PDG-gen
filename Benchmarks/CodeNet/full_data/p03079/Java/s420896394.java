import java.util.Scanner;
public class Main {

	public static void main(String[]args) {
		
		Scanner S = new Scanner(System.in);
		
		int[] t = new int[3];
		
		for(int i = 0; i<3; i++) {
			t[i] = S.nextInt();
		}
			if(t[0] == t[1] && t[1] == t[2]) {
				
				System.out.println("Yes");
					
			}
			else {
				System.out.println("No");
			}
		}
	}
