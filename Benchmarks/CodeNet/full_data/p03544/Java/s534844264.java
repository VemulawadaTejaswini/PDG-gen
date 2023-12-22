import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		if(N == 0){
			System.out.println(1);
			return;
		}
		
		if(N == 1){
			System.out.println(2);
			return;
		}
		if(N == 2){
			System.out.println(3);
			return;
		}
		
		if(N >= 3){
			long i = 0;
			long sum = 0;
			long current = 3;
			long before = 1;
			
			while(i < N-2){
				sum = before + current;
				before = current;
				current = sum;
				
				i++;
			}
			System.out.println(sum);
			return;
		}	
		
	}

}