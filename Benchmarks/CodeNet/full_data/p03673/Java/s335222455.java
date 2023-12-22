import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		List<Integer> a = new ArrayList<Integer>();
		for(int i = 1;i<=n;i++){
			if(i%2 == 0){
				a.add(sc.nextInt());
			}else{
				a.add(0, sc.nextInt());
			}
		}
		if(a.size()%2==0){
			Collections.reverse(a);
		}


		for(int i:a){
			System.out.print(i+" ");
		}
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