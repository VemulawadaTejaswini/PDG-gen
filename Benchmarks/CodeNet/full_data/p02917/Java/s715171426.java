import java.util.*;

public class Main {
	public static void main(String[] args) {
	
   Scanner sc = new Scanner(System.in);
   
    int N = sc.nextInt();
    Integer B[] = new Integer[N-1];
	for (int i=0; i<N-1; i++) {
		B[i] = sc.nextInt();
	}
	int ans = 0;
	
	Integer A[] = new Integer[N];
	for(int i = 0; i<N; i++) {
		   if(i == 0) {
			   A[i] = B[i];
			   ans += A[i];
		   }else if(i == N) {
			   A[i] = B[N-1];
			   ans += A[i];
		   }else{
			   for(int j = 0; j<9; j++) {
			   if(j <= B[i-1] && j <= B[i]) {
			   continue;
		       }else {
			   A[i] = j-1;
			   ans += A[i];
		       }
			   }
	       }
}
	System.out.println(ans);
}
}


