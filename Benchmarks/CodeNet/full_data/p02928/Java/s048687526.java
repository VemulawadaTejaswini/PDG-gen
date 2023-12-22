import java.util.*;

class Main{

    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();

	int K = sc.nextInt();

	int[] A = new int[N];

	int preans = 0;

	int ans = 0;

	for(int i=0; i<N; i++){

	A[i] = sc.nextInt();

  }

	for(int i=0; i<N-1; i++){

	if(A[i]>A[i+1]){

	preans++;

    }

   }

	for(int i=0; i<N; i++){

	for(int j=0; j<N; j++){

	if(A[i]>A[j]){

	ans++;

    }

   }

   }		

	int B = 0;	

	for(int i=1; i<K; i++){

	B += i;

  }



	int lastans = preans*K + B*ans;

	System.out.println(lastans%(1000000000+7));

 }
}