import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long x = sc.nextInt();
		long count = 0;
		for(; b >= a; b--){
			if(b % x == 0){
				count++;
			}
		}
		System.out.println(count);

	}

}
