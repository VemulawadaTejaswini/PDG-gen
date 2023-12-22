import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      	int M = N;
		int sum = 0;
		while(N != 0){
			sum += N%10;
			N /= 10;
		}
		System.out.println(M%sum == 0? "Yes": "No");
	}
}