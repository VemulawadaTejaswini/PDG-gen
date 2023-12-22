import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if ("snuke".equals(sc.next())) {
					System.out.println(String.valueOf((char)(j + 'A')) + (i + 1));
					return;
				}
			}
		}
	}
}
