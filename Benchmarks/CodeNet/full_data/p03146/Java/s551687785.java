import java.util.*;
public class Main {
	static int modAns = (int)Math.pow(10, 9) + 7;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int a = a1;
		int count = 0;
		int bucket[] = new int[1000010];
		while(true) {
			count ++;
			if(bucket[a] > 0) { break; }
			bucket[a] ++;
			a = func(a);
		}
		System.out.println(count);
	}

	public static int func(int n) {
		return n % 2 == 0 ? n / 2 : n * 3 + 1;
	}
}