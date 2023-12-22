import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		long M = sc.nextLong();

		if(N==1 || M==1){
			if(N==1 && M==1) System.out.println(1);
			else{
				System.out.println(Math.max(N,M)-2);
			}
		}
		else{
			System.out.println((N-2) * (M-2));
		}		

	}
}