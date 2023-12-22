import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int query=0;query<T;++query){
			long A = sc.nextLong();
			long B = sc.nextLong();
			long C = sc.nextLong();
			long D = sc.nextLong();
			if(B>A || B>D) System.out.println("No");
			else{
				A -= (A/B)*B;
				if(C<A) System.out.println("No");
				else if(C>=B) System.out.println("Yes");
				else{
					D = D%B;
					//System.out.println(A+" "+B+" "+C+" "+D);
					if(D==0) System.out.println("Yes");
					else if(gcd(B,D)==1){
						if(B-C>1) System.out.println("No");
						else System.out.println("Yes");
					}else{
						B -= A;
						C -= A;
						if(B/D - C/D == 1 && B%D == 0) System.out.println("Yes");
						else if(B/D - C/D >= 1) System.out.println("No");
						else System.out.println("Yes");
					}
				}
			}
		}
		return;
	}

	public static long gcd(long m, long n) {
		if(m < n) return gcd(n, m);
		if(n == 0) return m;
		return gcd(n, m % n);
	}
}