import java.io.PrintWriter;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.nextInt();
		LinkedList<Integer> q = new LinkedList<>();
		for(int i=0; i<N; i++)
			if((N-i)%2==1)
				q.addFirst(sc.nextInt());
			else
				q.addLast(sc.nextInt());
		
		for(int i=0; i<N; i++)
			pw.print(q.get(i) + (i==N-1 ? "\n" : " "));
		
		sc.close();
		pw.close();
	}
}
