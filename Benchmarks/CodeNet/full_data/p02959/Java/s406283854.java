import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N =scan.nextInt();
			
			int[]A = new int[N+1];
		    int[]B = new int[N];
		    
		    for(int i = 0;i<N+1;i++) {
		    	A[i] = scan.nextInt();
		    }
		    
		    for(int i = 0;i<N;i++) {
		    	B[i] = scan.nextInt();
		    }
		    
		    int taositagoukei = 0;
		    
		    
		    for(int i = N-1;i>=0;i--) {
		    	if(A[i]+A[i+1]>B[i]) {
		    		if(A[i+1]>B[i]) {
		    			A[i+1]-=B[i];
		    			taositagoukei+=B[i];
		    			B[i] = 0;
		    		}else{
		    			taositagoukei+=B[i];
		    			B[i] -=A[i+1];
		    			A[i+1] = 0;
		    			A[i]-=B[i];
		    			B[i] = 0;		
		    		}
		    		
		    	}else {//A[i]+A[i+1]<=BならA[i]とA[i+1]は０
		    		taositagoukei+=A[i]+A[i+1];
		    		B[i]-=(A[i]+A[i+1]);
		    		A[i]=0;
		    		A[i+1]=0;
		    		
		    	}
		    }
		    
		    
		    for(int i = 0;i<N+1;i++) {
		    	System.out.print(A[i]);
		    	System.out.print(" ");
		    	
		    }
		    
		    System.out.println();
		    
		    for(int i = 0;i<N;i++) {
		    	System.out.print(B[i]);
		    	System.out.print(" ");
		    }
		    
		    System.out.println();
		    
		    System.out.println(taositagoukei);
		    
		    
		    
		    
		    
		    
			
		}
		
		
	}
		

}
