import java.util.*;

class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		long count = 0L;
		
		for(int a = K ; a <= N ; a++ ){
			for(int b = K + 1 ; b <= N ;  b++){
				if(a == 0 ){continue;}
				if( a % b >= K){
					count ++ ;
				}
			}
		}
		System.out.println(count);
	}
}
