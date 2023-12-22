import java.util.*;

class Main{
	
    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();

	int ans =0;

	int V[] =new int[N];

	int C[] =new int[N];

	for(int i =0; i<N ;i++){	

	int V [] = new int[N];

	V[i] = 	sc.nextInt();			

   }

	for(int i =0; i<N ;i++){

	int C [] = new int[N];

	C[i] = sc.nextInt();

   }

	for(int i =0; i<N ;i++){

	if(V[i]<C[i]){

	ans += (V[i]-C[i]);	

    }
   }	

	System.out.println(ans);
  }
 }