import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int bar[] = new int[4];
			bar[0] = 1;
			bar[1] = 9;
			bar[2] = 7;
			bar[3] = 4;

			int in_bar[] = new int[4];

			for (int i=0; i<4; i++) {
				in_bar[i] = sc.nextInt();
			}
			
			int set_index[] = new int[4];
			int ok_count = 0;

			for (int i=0; i<4; i++) {
				for (int j=0; j<4; j++) {
					if (bar[i] == in_bar[j]) {
						ok_count++;
					}
				}
			}
			
			if (ok_count == 4) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}
	}
}