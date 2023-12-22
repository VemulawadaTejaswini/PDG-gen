import java.util.*;
public class Main {
	static int C(int n, int k){
		if(n == k){
			return 1;
		} else if(k == 1){
			return n;
		} else {
			return C(n-1, k-1) + C(n-1, k);
		}
	}
	
	public static void main(String[] args){
	
	//入力
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();
		int a=0;		//適当に調整
		
	
	//計算
		for(int i=0;i<(N+1);i++){
			int tmp=K-A*i;
			if((tmp%B)==0){
				a+=C(N,i)*C(N,tmp/B);
			}
		}
	
	//出力
		System.out.println(a);
	}
}