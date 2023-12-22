
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h, w;
		String a[];
		h = sc.nextInt();
		w = sc.nextInt();
		a = new String[h];
		for(int i = 0; i < h; ++i) {
			a[i] = sc.next();
		}
		sc.close();
		
		for(int i = -1; i < h + 1; ++i) {
			for(int j = -1; j < w + 1; ++j) {
				if(i == -1 || i == h || j == -1 || j == w)System.out.print("#");
				else System.out.print(a[i].charAt(j));
			}
			System.out.println();
		}
	}

}
