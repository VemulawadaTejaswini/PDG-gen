import java.util.*;
class Main {

	public static int getCvalue(int n, int m) {
			if(n < 2) {
				return 0;
			}
			else {
				int k = n - m;
				int a = 1;
				while(n > k) {
					a *= (n--);
					//System.out.println("a " + a);
				}
				return a/2;
			}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int res = 0;
		res += getCvalue(n, 2);
		//System.out.println(res);
		res += getCvalue(m, 2);

		System.out.println(res);
	}
}