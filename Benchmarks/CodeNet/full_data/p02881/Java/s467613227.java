import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    long N = sc.nextLong();
	    long ans = N + 1;
	    for(int i = 2; i <= Math.sqrt(N)+1; i++) {
	        if(N % i != 0) {
	            continue;        
	        }else {
	            if(i + N / i < ans) {
	                ans = i + N / i;
	            }
	        }
	    }
	    System.out.println(ans - 2);
	}

}