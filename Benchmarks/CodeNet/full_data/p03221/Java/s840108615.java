import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] data = new int[M][4];
		for(int i=0; i<M; i++){
			data[i][0] = i;
			data[i][1] = sc.nextInt();	//P
			data[i][2] = sc.nextInt();	//Y
			data[i][3] = 0;
		}
		Arrays.sort(data, (x, y) -> x[1]==y[1] ? x[2]-y[2] : x[1]-y[1]);
		int a = 0;
		int b = 0;
		for(int i=0; i<M; i++){
			if(data[i][1] != a){
				a = data[i][1];
				b = 0;
			}
			data[i][3] = ++b;
		}
		int[] count = new int[N+1];
		for(int i=0; i<=N; i++){
			count[i]=0;
		}
		int[] A = new int[M];
		int[] B = new int[M];
		for(int i=0; i<M; i++){
			A[data[i][0]] = data[i][1];
			B[data[i][0]] = ++count[data[i][1]];
		}
		StringBuilder string = new StringBuilder();
		for(int i=0;i<M;i++){
			string.append(String.format("%06d%06d\n", A[i], B[i]));
		}	
		System.out.print(string.toString());
		return;
	}
}