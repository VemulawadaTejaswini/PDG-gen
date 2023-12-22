import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int n = Integer.parseInt(W);

		W = in.readLine();
		String[] D = W.split(" ");

		long[] m = new long[n];
		Arrays.fill(m, 0);

		long[] a = new long[n];
		long sum = 0;
		for(int i=0;i<D.length;i++){
			a[i] = Long.parseLong(D[i]);
			sum+=a[i];
		}

		m[0] = sum;
		for(int i = 1;i<n;i=i+2){
			m[0] -= 2*a[i];
		}

		for(int i = 1 ; i<n ;i++){
			m[i] = 2*a[i-1] - m[i-1];
		}


		StringBuffer sb = new StringBuffer();
		for(int i=0;i<m.length;i++){
			sb.append(String.valueOf(m[i]));
			if(i!=m.length-1){
				sb.append(" ");
			}
		}

		System.out.println(sb.toString());

	}


}
