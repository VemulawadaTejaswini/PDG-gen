import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int f(int n) {
		if(n % 2 == 0) return n / 2;
		else return 3 * n + 1;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int s = sc.nextInt();
		int[] a = new int[1000010];
		int[] check = new int[1000010];
		Arrays.fill(check, 0);
		a[1] = s; check[s]++;
		for(int i = 2; i < a.length; i++) {
			a[i] = f(a[i - 1]);
			check[a[i]]++;
			if(check[a[i]] > 1) {
				System.out.println(i);
				break;
			}
		}
	}
}
