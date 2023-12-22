import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int a[] = new int[n];

		for(int i = 0; i<n;i++){
			int j = sc.nextInt();
			a[i] = j;
		}

		int sum=a[0];
		boolean plusFlag;
		int ans=0;
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

		System.out.println(ans);







		sc.close();
	}


}