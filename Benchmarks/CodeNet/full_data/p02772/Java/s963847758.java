import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
     int N = sc.nextInt();
     Integer A[] = new Integer[N];
		for (int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		int sum = 1;
		
    for(int i=0; i<N; i++) {
    	if((A[i] % 6 == 0) && (A[i] % 10 == 0)) {
    		sum += 1;
    	}else if(A[i] % 2 != 0){
    		sum += 1;
    	}else {
    		sum *= 0;
    	}
    }	
	}
	}