import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		int M[] = new int[N];


		for(int n=0;n<N;n++){
			M[n] = sc.nextInt();
		}

		int total = M[0];
		int min = M[0];

		for(int n=1;n<N;n++){
			total += M[n];
			if(min > M[n])
				min = M[n];
		}

		System.out.println((X - total)/min +N);

	}
}