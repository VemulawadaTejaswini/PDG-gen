import java.util.Scanner;

// 11
class Main{
	static int breakNumber(int n) {
		if (n % 2 == 0) {
			int tmp = n;
			int count = 0;
			while (tmp > 0) {
				if(tmp / 2 == 1) {
					++count;
					break;
				}
				tmp /= 2;
				++count;
			}
			return count;
		}
		
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int ans = 0;
		for(int i = 2; i <= N; i++)
			ans = Math.max(ans, breakNumber(i));
		
		System.out.println((int)Math.pow(2, ans));
	}

}
