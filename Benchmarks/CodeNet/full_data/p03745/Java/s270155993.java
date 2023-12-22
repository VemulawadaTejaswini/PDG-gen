import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if(N == 0){
			System.out.println(0);
		}
		else if(N == 1 || N == 2){
			System.out.println(1);
		}
		
		else{
			long[] A = new long[N];
			for(int i = 0; i < N; i++){
				A[i] = sc.nextLong();
			}
			int flag = 0;
			int count = 0;
			
			for(int i = 1; i < N; i++){
				if(A[i] != A[i - 1]){
					if(flag == 0){
						flag = A[i] < A[i - 1] ? -1 : 1;
					}
					else if(flag == -1){
						if(A[i] > A[i - 1]){
							flag = 0;
							count++;
						}
					}
					else{
						if(A[i] < A[i - 1]){
							flag = 0;
							count++;
						}
					}
				}
			}
			
			count ++;
			System.out.println(count);
		}
		sc.close();
	}
}
