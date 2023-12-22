import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(100 + " " + 100);
		boolean[][] x = new boolean[100][100];
		int a = 1, b = 1, s = 0;
		LOOP:for(int i = 0; i < 100; i++) {
			if(i % 2 == 1)
				s = 1;
			for(int j = s; j < 100; j+=2) {
				if(a == A)
					break LOOP;
				x[i][j] = true;
				a++;
			}
		}
		LOOP:for(int i = 51; i < 100; i++) {
			if(i % 2 == 1)
				s = 1;
			for(int j = s; j < 100; j+=2) {
				if(b == B)
					break LOOP;
				x[i][j] = true;
				b++;
			}
		}
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				if(i < 50) {
					if(x[i][j])
						System.out.print(".");
					else
						System.out.print("#");
				}
				else {
					if(x[i][j])
						System.out.print("#");
					else
						System.out.print(".");
				}
			}
			System.out.println();
		}
	}

}