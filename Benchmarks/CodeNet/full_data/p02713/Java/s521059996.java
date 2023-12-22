import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        long count = 0;

		for(int a=1; a<(k+1); a++){
		for(int b=1; b<(k+1); b++){
		for(int c=1; c<(k+1); c++){
			count+=gcd((gcd(a,b)),c);		
		}}}
		
		System.out.println(count);
	    scan.close();	
    }

	//ユークリッドの互除法
    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
}