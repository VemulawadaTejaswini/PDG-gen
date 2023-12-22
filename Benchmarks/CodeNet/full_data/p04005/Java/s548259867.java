import java.util.Scanner;
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		int C = sc.nextInt();
		
		if (C % 2 == 0) {
			System.out.println(0);
		} else {
			System.out.println(A * B);
		}
	}
}