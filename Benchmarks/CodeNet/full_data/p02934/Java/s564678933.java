import java.util.*;

class Main{

    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();

	float sum = 0;

	int[] A = new int[N];

	for(int i=0; i<N; i++){

	A[i] = sc.nextInt();

  }

	for(int i=0; i<N; i++){

	sum += 1/A[i];		

  }

	System.out.println(1/sum);
 }
}