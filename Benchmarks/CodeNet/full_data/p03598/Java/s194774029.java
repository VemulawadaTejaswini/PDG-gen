import java.util.Scanner;

public class Main{
	static Scanner s = new Scanner(System.in);			//文字の入力

	static int N = s.nextInt();
	static int K = s.nextInt();					//マシンBの初期位置:x
	static int x[] = new int[N];
	static int sum = 0;


	static int ans = 0;
	public static void main(String[] args){

		solve();

	}


	static void solve() {
		for(int i=0;i < N;i++){
			x[i] = s.nextInt();
		}						//入力
		for(int i=0;i < N;i++){
			if(Math.abs(x[i] - K) >= x[i]){
				sum += 2*x[i];
			}else{
				sum += 2*Math.abs(x[i]-K); 
			}
		}
		System.out.println(sum);
	}

}