import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		if (a > b || a < 0 || b < 0 || a > 1000000000 || b > 1000000000 || k < 0 || k > 100) {
			throw new IllegalArgumentException();
		}
		int x = a + k - 1;
		if (x > b) {
			x = b;
		}
		if(x<a){
			x=a;
		}

		int y = b - k + 1;
		if (y < a) {
			y = a;
		}
		if(y>b){
			y=b;
		}
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = a; i <= x; i++) {
			set.add(i);
		}
		for (int i = y; i <= b; i++) {
			set.add(i);
		}
		for (Integer j : set) {
			System.out.println(j);
		}
	}
}
