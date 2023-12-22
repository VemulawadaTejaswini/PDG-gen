import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++){
			A[i] = sc.nextInt();
		}
		int max = A[0];
		int min = A[0];
		for(int j=1; j<N; j++){
			if(max < A[j]){
				max = A[j];
			}
			if(min > A[j]){
				min = A[j];
			}
		}
		int ans = max - min;
		System.out.println(ans);
	}
}