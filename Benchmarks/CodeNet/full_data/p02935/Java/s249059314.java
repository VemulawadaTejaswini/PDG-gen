import java.util.*;

class Main{

    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();

	int[] v = new int[N];

	for(int i=0; i<N; i++){

	v[i] = sc.nextInt();

  }

	Arrays.sort(v);

	double pri = (v[0]+v[1])/2;

	for(int i=2; i<N-1; i++){

	pri = pri+v[i];

	pri /= 2;

  }

	System.out.println(pri);


 }
}