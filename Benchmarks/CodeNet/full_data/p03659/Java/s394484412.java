import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int sum = 0;
		for(int i=0; i<N; i++){
			a[i] = sc.nextInt();
			sum += a[i];
		}
		long ans = Long.MAX_VALUE;
		int x = a[0];
		int y = sum - x;
		ans = (x-y)>0?(x-y):(x-y)*(-1);
		if(N != 2){
			for(int i=1;i<N-1;i++){
				long ans1 = x + a[i] * 2 - y;
				long ans2 = x - y;
				ans1 = (ans1>=0)?ans1:ans1*(-1);
				ans2 = (ans2>=0)?ans2:ans2*(-1);
				if(ans1<ans2){
					if(ans1<ans){
						ans = ans1;
					}
				}else{
					if(ans2<ans){
						ans = ans2;
					}
				}
				x += a[i];
				y -= a[i];
			}
		}
		System.out.println(ans);
		sc.close();
	}

}
