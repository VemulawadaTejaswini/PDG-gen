import java.util.*;

class Main{

    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();

	int K = sc.nextInt();

	int Q = sc.nextInt();

	int[] A = new int[N];

	int[] M = new int[N];

	for(int i=0; i<Q; i++){

	A[i] = sc.nextInt();	

  }

	for(int i=0; i<N; i++){
		
	M[i] = K-Q;
		
  }

	for(int i=1; i<N+1; i++){

	for(int j=0; j<Q; j++){

	if(A[j] == i){

	M[i-1] += 1;

   }

  }

  }
	
	for(int i=0; i<N; i++){

	if(M[i]>0){

	System.out.println("Yes");

   }

	else{

	System.out.println("No");

   }

  }

 }
}
