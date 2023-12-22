import java.util.*;

class Main{

    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();

	int M = sc.nextInt();

	int [] A = new int[N];

	int [] B = new int[N];

	int C = 0;

	for(int i=1; i<N+1; i++){	

	A[i] = sc.nextInt();

	B[i] = sc.nextInt(); 	

  }

	for(int i=1; i<N+1; i++){

	if((i+A[i])<=M){

	C += C + B[i];

   }
  }	

	System.out.println(C);
  
 }
}