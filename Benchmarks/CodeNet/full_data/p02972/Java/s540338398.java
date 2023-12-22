import java.io.PrintWriter;
import java.util.BitSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 PrintWriter out = new PrintWriter(System.out);
		 StringBuilder sb = new StringBuilder();
		 
		 int N = sc.nextInt();
		 BitSet in = new BitSet(N + 1);
		 BitSet result = new BitSet(N + 1);
		 
		 for (int i = 1; i <= N; i++) {
			 in.set(i, sc.nextInt() == 1);
		 }
		 
		 for (int i = N; i >= 1; i--) {
			 boolean t = in.get(i);
			 for (int j = i * 2; j < N; j += i) {
				 t ^= in.get(j);
			 }
			 result.set(i, t);
		 }
		 
		 out.println(result.cardinality());
		 for (int i = 1; i <= N; i++) {
			 if (result.get(i)) {
				 sb.append(i).append(" ");
			 }
		 }
		 out.println(sb);
		 
		 sc.close();
		 out.flush();
		 

	}

}
