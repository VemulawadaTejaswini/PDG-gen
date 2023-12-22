import java.util.*;
 
class Main{
	
    public static void main(String[] args){
 
	Scanner sc = new Scanner(System.in);
 
	int N = sc.nextInt();

	int[] A = new int[N];

	int[] B = new int[N];

	for(int i=0; i<N; i++){
	
	A[i] = sc.nextInt();

	B[i] = A[i];

   }

	Arrays.sort(B);

	for(int i=0; i<N; i++){

	if(A[i]==B[N-1]){

	for(int j=N-1; j>-1; j--){
		
	if(B[j]<B[N-1]){
		
	System.out.println(B[j]);
	
	break;
		
	}
		
	}

    }

	else{

	System.out.println(B[N-1]);

    }

   }
 
  }
 }