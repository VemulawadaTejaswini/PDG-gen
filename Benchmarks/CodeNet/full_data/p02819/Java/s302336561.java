import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(!isPrime(n)) {
        	n++;
        }
        System.out.println(n);
    }

    private static boolean isPrime(int n) {
    	if(n <= 1) return false;
    	for(int i = 2; i * i <= n; i++) {
    		if(n % i == 0)
    			return false;
    	}
    	return true;
    }
}
