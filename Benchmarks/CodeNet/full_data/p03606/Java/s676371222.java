import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int sum = 0;
		for(int i = 1; i<=N; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			sum += (b-a+1);
		}
		
		System.out.println(sum);
	}

}
