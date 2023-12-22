import java.util.Scanner;

public class Main{
	
	public static long factorial(long x){
		for(long i = x - 1; i >= 2; i--){
			x = x * i % 1000000007;
		}
		
		return x;
	}
	
	public static void main(String... args){
		Scanner scan = new Scanner(System.in);
		
		// input
		long dog = scan.nextLong();
		long monkey = scan.nextLong();
		
		// search
		long answer = 0;
		if(dog == monkey){
			answer = factorial(dog) * factorial(monkey) * 2 % 1000000007;
		} else if (Math.abs(dog - monkey) == 1){
			answer = factorial(dog) * factorial(monkey) % 1000000007;
		} else {
			answer = 0;
		}
		
		// answer
		System.out.println(answer);
		
	}
}