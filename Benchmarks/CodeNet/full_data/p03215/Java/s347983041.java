
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		int K=scan.nextInt();
		int[] a = new int[N];
		for(int i=0; i<N; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();

		int[] bubun = new int[N*(N+1)/2];
		String[] bubunBit = new String[N*(N+1)/2];
		int s = 0;
		for(int i=0; i<N; i++) {
			for(int j=i; j<N; j++) {
				for(int k=i; k<=j; k++) {
					int xxx = a[k];
					bubun[s] += xxx;
				}
				//System.out.println(bubun[s]);
				bubunBit[s] = Integer.toBinaryString(bubun[s]);
				s++;
			}
		}

		//Arrays.sort(bubunBit);
		i(bubunBit);

		int maxLength = bubunBit[0].length();
		for(int i=1; i<bubunBit.length; i++) {
			if(maxLength < bubunBit[i].length()) {
				maxLength = bubunBit[i].length();
			}
		}
		while(true) {
			String[] p = new String[K];
			int pi=0;
			for(int i=0; i<bubunBit.length&&pi<K; i++) {
				if(bubunBit[i].length() >= maxLength) {
					if(bubunBit[i].charAt(bubunBit[i].length()-maxLength)=='1') {
						p[pi] = bubunBit[i];
						pi++;
					}
				}
			}
			if(pi==K) {
				int r = Integer.parseInt(p[0],2);
				for(String q:p) {
					r = r & Integer.parseInt(q,2);
				}
				System.out.println(r);
				return;
			}
			maxLength--;
		}

	}

	public static void i(String[] A) {
		for(int i=0; i<A.length; i++) {
			String v = A[i];
			int j=i-1;
			while(j>=0 && Integer.parseInt(A[j])<Integer.parseInt(v)) {
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = v;
		}
	}
}
