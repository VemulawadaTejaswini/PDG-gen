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
		int b = -1;
		for(int i=0; i<M; i++){
			if(data[i][1] != a){
				a = data[i][1];
				b = -1;
			}
			data[i][3] = ++b;
		}
		Arrays.sort(data, (x, y) -> x[0]-y[0]);
		for(int i=0; i<M; i++){
			System.out.printf("%06d%06d\n", data[i][1], data[i][3]+1);
		}
		return;
	}
}
