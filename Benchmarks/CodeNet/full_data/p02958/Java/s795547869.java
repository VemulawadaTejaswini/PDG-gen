import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int N = Integer.parseInt(stdin.next());
		int Nlist[] = new int[N];
		int list[] = new int[N];
		int p[] = new int[N];
		int cnt = 0;

		for(int i=0;i<N;i++) {
			p[i] = Integer.parseInt(stdin.next());
			list[i] = i+1;
		}
		
		for(int i=0;i<N;i++) {
			if(list[i] != p[i]) {
				cnt += 1;
			}
		}
		
		if(cnt > 2) {
			out.print("NO");
		}
		else {
			out.print("YES");
		}

		out.flush();
	}

}
