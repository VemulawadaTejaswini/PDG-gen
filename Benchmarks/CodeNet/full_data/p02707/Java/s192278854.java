import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b[] = new int[a-1];
		int c = 0;
		for (int i = 0; i < b.length ;i++) {
			b[i] = s.nextInt();
		}
		for(int j = 1; j < a + 1; j++) {
			c = 0;
			for(int k = 0; k < b.length ;k++) {
				if(b[k] == j) {
					c += 1;
				}
			}
			System.out.println(c);
		}

	}

}