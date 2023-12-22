import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
        long sum = 0;
		for(long i=0; i<Math.sqrt(n); i++){
          if((n % i != 0) && (n / i == n % i)) sum += i; 
        }
		System.out.println(sum);
	}
}