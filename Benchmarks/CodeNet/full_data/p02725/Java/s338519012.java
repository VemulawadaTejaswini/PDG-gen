import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int N = sc.nextInt();
		int max = 0;
		int buf,i;
		int[] A = new int[N];
		for(i = 0;i < N;i++){
			A[i] = sc.nextInt();
		}
		for(i = 0;i < N;i++){
			if(i == N-1){
				buf = (K + A[0]) - A[i];
			}else{
				buf = A[i+1] - A[i];
			}
			if(buf > max){
				max = buf;
			}
		}
		System.out.println(max);
	}	
}