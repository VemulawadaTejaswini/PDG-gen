import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	int N,K;
	int[] V;
	
	int[] f(int a, int b) {
		int[] result = new int[a+b];
		
		for(int i=0;i<a;i++) {
			result[i] = V[i];
		}
		for(int i=0;i<b;i++) {
			result[result.length-i-1] = V[V.length-i-1];
		}
		return result;
	}
	
	int negNum(int[] a) {
		int result = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i] < 0) {
				result++;
			}else {
				break;
			}
		}
		return result;
	}
	
	int solv() {
		int ans = Integer.MIN_VALUE;
		for(int a=0;a<Math.min(N, K);a++) {
			for(int b=0;b<Math.min(N, K)-a;b++) {
				int[] arr = f(a,b);
				Arrays.sort(arr);
				int nn = negNum(arr);
				int sum = 0;
				for(int i=Math.min(nn, K-(a+b)); i<arr.length; i++) {
					sum += arr[i];
				}
				ans = Math.max(ans, sum);
			}
		}
		return ans;
	}
	
	
	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		N = sc.nextInt();
		K = sc.nextInt();
		
		V = new int[N];
		
		for(int i=0;i<N;i++) {
			V[i] = sc.nextInt();
		}
		
		out.println(solv());
		
		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
