import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double get = 0;
		int num = sc.nextInt();
		for(int i = 0; i < num; i ++) {
			get += sc.nextDouble() * (sc.next().equals("JPY") ? 1 : 380000.0);
		}
		System.out.println(get);
	}
}