import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();
		int tempx = x - k + 1;
		do {
			System.out.println(tempx);
			tempx++;
		} while(tempx <= x + k - 1);
	}
}