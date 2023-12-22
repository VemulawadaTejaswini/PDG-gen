import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int a[] = new int[n];
		int ans = 0;
		for(int i = 0; i<n;i++){
			int j = sc.nextInt();
			a[i] = j;
		}




		if(a[0] == 0){
			a[0] = -1;
			int ans1 = calc(a,ans,n) + 1;
			a[0] = 1;
			ans = 0;
			int ans2 = calc(a,ans,n) + 1;

			ans = Math.min(ans1, ans2);
		}else{
			ans = calc(a,ans,n);


		}
		System.out.println(ans);







		sc.close();
	}

	private static int calc(int[] a,int ans,int n) {
		int sum=a[0];
		boolean plusFlag;
		// TODO 自動生成されたメソッド・スタブ
		if(a[0] > 0){
			plusFlag = true;
		}else{
			plusFlag = false;
		}



		for(int i = 1;i<n;i++){
			sum += a[i];
			if(plusFlag){
				if(sum >= 0){
					ans += Math.abs(sum)+1;
					sum = -1;

				}
			}else{
				if(sum <= 0){
					ans += Math.abs(sum)+1;
					sum = 1;
				}
			}
			plusFlag = !plusFlag;
		}


		return ans;
	}


}