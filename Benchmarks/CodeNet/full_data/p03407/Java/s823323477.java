import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Integer a = sc.nextInt();
		Integer b = sc.nextInt();
		int price = sc.nextInt();
		Integer[] coins = {1, 5, 10, 50, 100, 500};
		if (!Arrays.asList(coins).contains(a)) {
			a = 0;
		}
		if (!Arrays.asList(coins).contains(b)) {
			b = 0;
		}
		if (a + b < price) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}