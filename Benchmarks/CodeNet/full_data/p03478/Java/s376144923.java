import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int someSums = 0;
		for(int i = 1; i <= N; i++){
			int sum = calcSum(i);
			if(sum >= A && sum <= B) someSums += i;	
		}
		System.out.println(someSums);	
	}
	private static int calcSum(int num){
		int sum = 0;
		while(num > 0){
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}
}