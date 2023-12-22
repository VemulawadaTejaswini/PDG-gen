import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static long[] x = new long[100000];

	public static void main(String[] args) throws Exception {
		Arrays.fill(x, 0);
		x[0]=1;
		x[1]=1;
		x[2]=2;
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String W = in.readLine();
		int N = Integer.parseInt(W.split(" ")[0]);
		int M = Integer.parseInt(W.split(" ")[1]);

		long ans =1;
		int p = 0;
		for(int i=0;i<M;i++){
			W = in.readLine();
			int n = Integer.parseInt(W);
			if(p!=0 && n-p==0){
				ans = 0;
				break;
			}

			ans = Long.remainderUnsigned(ans * fibonacci(n-p),1000000007);

			p=n+1;
		}
		ans = Long.remainderUnsigned(ans * fibonacci(N-p),1000000007);


		System.out.println(ans);
	}

	public static long fibonacci(int n){
		if(x[n-1]==0){
			for(int i=3;i<n;i++){
				if(x[i]==0){
					x[i] = (x[i-1]+x[i-2]);
				}
			}
		}
		return x[n-1];
	}
}
