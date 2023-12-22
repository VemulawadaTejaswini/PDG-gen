import java.util.*;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int MAX = 0;
        int MAX2 = 0;
        
        for(int i = 0; i<N; i++) {
        	A[i] = sc.nextInt();
        }
        	
        for(int i = 0; i<N; i++) {
        	if(A[i]>=MAX) {
        		MAX2 = MAX;
        		MAX = A[i];
        	} else if(A[i]>MAX2) {
        		MAX2 = A[i];
        	}
        }

      	for(int i = 0; i<N; i++) {
       		if(A[i]==MAX) {
       			System.out.println(MAX2);
        	} else {
        		System.out.println(MAX);
        	}
        	
        }
        
    }
}