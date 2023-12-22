import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		int K = sc.nextInt();
		
		long[] A = new long[X];
		long[] B = new long[Y];
		long[] C = new long[Z];
		
		for(int i=0;i<X;i++) {
			A[i] = sc.nextLong();
		}
		for(int i=0;i<Y;i++) {
			B[i] = sc.nextLong();
		}
		for(int i=0;i<Z;i++) {
			C[i] = sc.nextLong();
		}
		
		long[] AB = new long[X*Y];
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<B.length;j++) {
				AB[i*B.length+j] = A[i] + B[j];
			}
		}
		
		Arrays.sort(AB);
		long[] AB2 = new long[Math.min(K, AB.length)];
		for(int i=0;i<AB2.length;i++) {
			AB2[i] = AB[AB.length-i-1];
		}
		AB = null;
		
		long[] ABC = new long[K*Z];
		for(int i=0;i<AB2.length;i++) {
			for(int j=0;j<C.length;j++) {
				ABC[i*C.length+j] = AB2[i] + C[j];
			}
		}
		Arrays.sort(ABC);
		
		for(int i=0;i<Math.min(K,ABC.length);i++) {
			out.println(ABC[ABC.length-i-1]);
		}
		
		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
