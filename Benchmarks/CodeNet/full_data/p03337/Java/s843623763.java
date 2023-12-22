import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();

		if(N*M >= N+M){
			if(N*M > N-M) System.out.println(N*M);
			else System.out.println(N-M);
		}
		else{
			if(N+M > N-M) System.out.println(N+M);
			else System.out.println(N-M);
		}
	}
}