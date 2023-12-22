import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt(), V = sc.nextInt(), P = sc.nextInt();
		int A[] = new int[N];
		for(int i = 0;i<N;i++) A[i]=sc.nextInt();
		sc.close();
		rsort(A);
	
		long l = P-1;
		long r = N-1;
		while(l+1<r) {
			long c = (l+r)/2;
			int tar = (int)c;
			long now = A[tar];
			long line = (long)now + M;
			//A[P-1]~A[tar - 1]をline以下にできるか
			long needPlus = ((long)V-(P-1)-((long)(N-1)-tar + 1))*M;
			long sum = 0;
			for(int i=P-1;i<tar;i++) {
				sum += A[i];
			}
			long max = Math.max(A[P-1], ((long)sum+needPlus+tar-(P-1)-1)/((long)tar-(P-1)));
			if(line>=max) l=c;
			else r=c;
		}
		
		System.out.println(l+1);
	}
	static void rsort(int arr[]) {
		Arrays.sort(arr);
		int len = arr.length;
		for(int i=0;i<len/2;i++) {
			int tmp = arr[i];
			arr[i]=arr[len-1-i];
			arr[len-1-i]=tmp;
		}
	}
}