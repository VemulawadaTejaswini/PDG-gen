import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		String A = sc.next();
		String B = sc.next();

		if(N < M){
			int t = N;
			N = M;
			M = t;
			String st = A;
			A = B;
			B = st;
		}
		
		int tmp;
		int x=N;
		int y=M;
        while ((tmp = x % y) != 0) {
           	x = y;
           	y = tmp;
        }
        int gcd = y;
        int lcm = M*N/gcd;
        boolean f = true;
        for(int n=0,k=0;n<lcm;n+=(M/gcd)*(N/gcd),k++){

        	if(A.charAt(k*N/gcd) != B.charAt(k*M/gcd)){
        		f = false;
        		break;
        	}
        }
       	if(f) System.out.println(lcm);
       	else System.out.println("-1");
		
	}
}