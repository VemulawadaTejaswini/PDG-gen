import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		if (k % 2 == 0) {
			int a = k / 2;
			if (n >= a) {
				int x = (n - a) / k + 1;
				count += (x * x * x);
			}
			a = k;
			if (n >= a) {
				int x = (n - a) / k + 1;
				count += (x * x * x);
			}
		} else {
			int a = k;
			if (n >= a) {
				int x = (n - a) / k + 1;
				count += (x * x * x);
			}
		}
		System.out.println(count);
	}
}