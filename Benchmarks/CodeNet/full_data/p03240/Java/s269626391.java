import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer in=new StringTokenizer(br.readLine());
        int N =Integer.parseInt(in.nextToken());
        in = null;
        int[] X = new int[N];
        int[] Y = new int[N];
        long[] H = new long[N];
		for (int i = 0; i < N; i++) {
			in =new StringTokenizer(br.readLine());
	        X[i] =Integer.parseInt(in.nextToken());
	        Y[i] =Integer.parseInt(in.nextToken());
	        H[i] = Long.parseLong(in.nextToken());
	        in = null;
		}
		br=null;
		int ansX = X[0];
		int ansY = Y[0];
		long ansH = H[0];
		for (int i = 0; i <= 100; i++) {
			for (int j = 0; j <= 100; j++) {
				long h = -1;
				boolean isAns = true;
				for (int k = 0; k < N; k++) {
					long tmp = H[k] + Math.abs(i-X[k]) + Math.abs(j-Y[k]);
					if ((tmp != h || h < 0) && k > 0 ) {
						isAns = false;
						break;
					}
					h = tmp;
				}
				if (isAns && N > 1) {
					ansX = i;
					ansY = j;
					ansH = h;
					break;
				}
			}
		}

		System.out.println(ansX + " " + ansY + " " + ansH);
	}



}