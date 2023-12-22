import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		long sum = 0;

		for (int i = 1;i<=n ;i++ ) {
			sum += combiF(n,i)%(100000000+7);
			if (i==a||i==b) {
				sum -= combiF(n,i)%(100000000+7);
			}
		}
		System.out.println(sum);

	}
	public static long factF(int n) {
    int f = 1;
      for (int i = 1; i <= n; i++) {
        f = f * i;
      }
      return (f);
  }
	public static long combiF(int n, int r){
		long si = factF(n);
		long bo = factF(r)*factF(n-r);
		long ans = (si/bo);
		return ans;
		}
}
