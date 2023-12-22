import java.util.Scanner;

public class Main{
	static int[] sos = new int[1000000];
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long x = scan.nextLong();
		while(!isPrime(x)) {
			x++;
		}
		System.out.println(x);
	}
	public static boolean isPrime(long num) {
	    if (num < 2)
	    	return false;
	    else if (num == 2)
	    	return true;
	    else if (num % 2 == 0)
	    	return false;

	    double sqrtNum = Math.sqrt(num);
	    for (long i = 3; i <= sqrtNum; i += 2){
	        if (num % i == 0){
	            return false;
	        }
	    }
	    return true;
	}
}