import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[] nums = new int[1001];
		for(int i = 2; i <= x; i++) {
			int num = i;
			int warusu = 2;
			while(num > 1) {
				if(num%warusu==0) {
					nums[warusu]++;
					num/=warusu;
				} else warusu++;
			}
		}
		long ans = 1;
		for(int j = 2; j <= 1000; j++) {
			ans = (ans*(nums[j]+1)) % 1000000007;
		}
		System.out.println(ans);
	}
}