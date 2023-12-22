import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[sc.nextInt()];
		int count = 0;
		
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}
		
		while (true) {
			for (int i = 0; i < n.length; i++) {
				if (n[i] % 2 == 0) {
					n[i] /= 2;
				} else {
					System.out.println(count);
					return;
				}
			}
			count++;
		}
		
	}
}