import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		long[] A = new long[N];
		String[] a = new String[N];
		long max = 0;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
			a[i] = Long.toBinaryString(A[i]);
			max = Math.max(max, A[i]);
		}
		sc.close();
		String k = Long.toBinaryString(K);
		int l = k.length();
		int f = Long.toBinaryString(max).length();

		int g = Math.max(l, f);
		int[] c = new int[g];

		for(int i = 0; i < N; i++) {
			String b = a[i];
			int l1 = b.length();
			for(int j = 0; j < l1; j++) {
				if(b.charAt(j) == '1') {
					c[l1 - j - 1] ++;
				}
			}
		}

		int[] m = new int[l];

		for(int i = 0; i < l; i++) {
			if(k.charAt(i) == '1') {
				m[i] = 1;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < l; i++) {
			if(c[i] > N / 2) {
				sb.append(0);
			}else {
				sb.append(1);
			}
		}
		sb.reverse();
		//System.out.println(sb.toString());
		long t = Long.parseLong(sb.toString(), 2);
		if(t > K) {
			for(int i = 0; i < l; i++) {
				if(m[i] == 0 && sb.charAt(i) == 1) {
					sb.replace(i, i + 1, "0");
					long r = Long.parseLong(sb.toString(), 2);
					if(r <= K) {
						break;
					}
				}
			}
		}
		//System.out.println(t);
		long t1 =  Long.parseLong(sb.toString(), 2);
		long sum = 0;
		if(K == 0) t1 = 0;
		for(long i : A) {
			sum += t1 ^ i;
		}
		System.out.println(sum);
	}
}