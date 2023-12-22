import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
		int[] A = new int[N];
		int first = sc.nextInt();
		A[0] = first;
		A[1] = first;
		int second = 0;
		for(int i=1;i<N-1;i++){
			second = sc.nextInt();
			if(A[i] > second){A[i]=second;}
			A[i+1] = second;
		}
		A[N-1] = second;
		int Ans =0;
		for(int i=0;i<N;i++){
			Ans += A[i];
		}
		System.out.println(Ans);
		sc.close();
	}
}