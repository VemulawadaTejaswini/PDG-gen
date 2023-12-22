import java.io.PrintWriter;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		//String S = sc.next();
		//int N = Integer.parseInt(sc.next());
		//out.println();
		int cnt = 0;
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		int b[] = new int[M];
		int a[][]  = new int[N][M];
		for(int i=0;i<M;i++){
			b[i] = Integer.parseInt(sc.next());
		}
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				a[i][j] = Integer.parseInt(sc.next());
			}
			int keisan = 0;
			for(int j=0;j<M;j++){
				keisan += a[i][j]*b[j];
			}
			keisan += C;
			if(keisan>0){
				cnt++;
			}
		}
		

		out.print(cnt);
		out.flush();	
	}
}