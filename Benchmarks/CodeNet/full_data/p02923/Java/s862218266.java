import java.util.*;

class Main{

    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();

	int[] H = new int[N+1];

	for(int i=0; i<N; i++){

	H[i] = sc.nextInt();	

  }

	H[N] = 1000000001;

	int ans = 0;

	int max = 0;

	for(int i=0; i<N; i++){

	int j = i;

	while(H[j] >= H[j+1]){

	ans ++;

	j++;

   }

	if(ans >= max){

	max += (ans-max);

   }

  }

	System.out.println(max);	

 }
}