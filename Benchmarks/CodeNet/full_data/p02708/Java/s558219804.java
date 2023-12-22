import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    long N = sc.nextLong();
	    long K = sc.nextLong();
	     
	    long min = 0;
	    long max = 0;
	    for(int i = 0; i < K; i++) {
	        min += i;
	        max += N - i;
	    }
	    long sum = max - min + 1;
	    
	    for(long i = K; i <= N; i++) {
	        min += i;
	        max += N - i;
	        sum += max - min + 1;
	    }
	    System.out.println(sum % 1000000007);
	    
	    
	}
	
	
}