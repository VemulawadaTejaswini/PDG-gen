import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b[] = new int[a];
		int c = 0;
		for (int i = 0; i < b.length -1 ;i++) {
			c = s.nextInt();
			b[c - 1] += 1;
		}
		for(int j = 0; j < b.length; j++) {
			System.out.println(b[j]);
		}

	}

}