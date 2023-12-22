import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int i;
		for(i=0; i<N; i++){
			a[i] = sc.nextInt();
		}
		int x = a[0];
		int y = a[N-1];
		int temp = N-2;
		int ans = (x-y)>0?(x-y):(y-x);
		if(N != 2){
			for(i=1;i<temp;i++){
				int ans1 = x + a[i] -y;
				int ans2 = x - a[temp] - y;
				if(ans1 < 0)
					ans1 *= -1;
				if(ans2 < 0)
					ans2 *= -1;
				if(ans1 < ans2){
					ans = ans1;
					continue;
				}else{
					ans = ans2;
					i--;
					temp--;
					continue;
				}
			}
		}
		System.out.println(ans);
	}

}