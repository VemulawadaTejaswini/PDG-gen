import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = null;
		PrintStream out = null;
		try {
			sc = new Scanner(System.in);
			out = System.out;
			exec(sc, out);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		} finally {
			if(out != null) {
				out.close();
			}
			if(sc != null) {
				sc.close();
			}
		}
		System.exit(0);
	}
	public static void exec(final Scanner sc, final PrintStream out) throws Exception{
		long A = sc.nextLong();
		long B = sc.nextLong();
		final HashSet<Long> Aset = new HashSet<>();
		final HashSet<Long> Bset = new HashSet<>();
		Aset.add(1L);
		Bset.add(1L);
		final long AMax = 1000000;//(long)Math.sqrt((double)A)+1;
		final long BMax = 1000000;//(long)Math.sqrt((double)B)+1;
		for(long i=2;i<=AMax;i++) {
			if(A < i) {
				break;
			}
			if(A%i!=0) {
				continue;
			}
			Aset.add(i);
			A = A/i;
			while(A%i==0) {
				A = A/i;
			}
		}
		Aset.add(A);
		for(long i=2;i<=BMax;i++) {
			if(B < i) {
				break;
			}
			if(B%i!=0) {
				continue;
			}
			Bset.add(i);
			B = B/i;
			while(B%i==0) {
				B = B/i;
			}
		}
		Bset.add(B);
//		System.err.println(Aset);
//		System.err.println(Bset);
		Aset.retainAll(Bset);
		out.println(Aset.size());
	}

}
