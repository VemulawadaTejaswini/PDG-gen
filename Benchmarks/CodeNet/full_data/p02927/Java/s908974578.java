import java.util.*;
 
public class Main {
 
	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int d = sc.nextInt();
		int count = 0;
		for (int i = 22; i <= d; i++) {
			if (i % 10 < 2) {
				continue;
			}
			if ((i % 10) * (i / 10) <= m) {
				count++;
			}
		}
		System.out.println(count);
	}
}