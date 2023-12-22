import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans=0;
		for(int i=1;i<=N;i++) {
			int temp = sum(i);
			if(temp>=a &&  temp <=b) ans+=i;
		}
		System.out.println(ans);
	}

	public static int sum(int num) {
		int res = 0;
		while(num!=0) {
			res += num%10;
			num/=10;
		}
		return res;
	}
}
