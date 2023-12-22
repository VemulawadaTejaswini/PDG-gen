import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();

		int map[] = new int[N+1];
		int degs[] = new int[N+1];


		for(int n=0;n<N;n++){
			map[n] = sc.nextInt();
		}
		map[N] = X;

		for(int n=1;n<N+1;n++){
			degs[n] = Math.abs(map[n-1] - map[n]);
		}
		degs[0] = Math.abs(map[N] - map[0]);

		int gcd=-1;
		for(int n=0;n<N+1;n++){
			if(n==0) gcd = degs[0];
			else gcd = GCD(gcd,degs[n]);
		}	

		System.out.println(gcd);


	}

	private static int GCD( int a, int b ) {
        if( a < b ) { int temp = a; a = b; b = temp; }
        if( b < 1 ) return -1; 

        if( a % b == 0 ) return b;
        return GCD( b, a % b );
    }
}