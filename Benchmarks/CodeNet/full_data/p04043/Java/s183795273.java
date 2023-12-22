import java.util.Scanner;

/**
 * https://beta.atcoder.jp/contests/abc042/tasks/abc042_a
 */
public class Main {

	public static void main(String[] args) {
		
		int[] a = new int[11];
		Scanner sc = new Scanner(System.in);
		a[sc.nextInt()]++;
		a[sc.nextInt()]++;
		a[sc.nextInt()]++;
		sc.close();
		
		String ans = "NO";
		if(a[5]==2 && a[7]==1){
			ans = "YES";
		}
		System.out.println(ans);

	}

}
