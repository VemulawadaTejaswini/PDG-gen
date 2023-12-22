
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0;i < n;i++) {
			a[i] = sc.nextInt();
		}
		int num = 1;
		int ans = 0;
		boolean flag = false;
		for(int i = 0;i < n;i++) {
			if(a[i] == num) {
				num++;
			}else {
				ans++;
				flag = true;
			}
		}

		if(ans == n) {
			ans = -1;
		}
		System.out.println(ans);



	}




	static long lcm (long a, long b) {
		long g = gcd(a,b);
		return a/g*b;
	}

	static long gcd(long a,long b){
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}



}


class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}
