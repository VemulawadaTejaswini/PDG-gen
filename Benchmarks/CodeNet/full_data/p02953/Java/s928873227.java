import java.io.PrintWriter;
import java.util.*;

public class Main {
		public static void main(String[] args) {
			Scanner stdin = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
			
			int N = Integer.parseInt(stdin.next());
			int H[] = new int[N];
			int flag;
			if(N==1) {
				flag=1;
			}
			else {
				flag=0;
			}
			
			for(int i=0;i<N;i++) {
				H[i] = Integer.parseInt(stdin.next());
			}
			
			for(int i=N-1;i>0;i--) {
				if(H[i-1]-H[i] > 1) {
					flag=0;
					break;
				}
				else if(H[i] < H[i-1]){
					H[i-1] -= 1;
				}
			}

			
			for(int i=0;i<N-1;i++) {
				if(H[i] <= H[i+1]) {
					flag =1;
				}
				else {
					flag=0;
					break;
				}
			}
				
			if(flag==1) {
				out.println("Yes");
			}
			else {
				out.println("No");
			}
			
			out.flush();
	}
}


