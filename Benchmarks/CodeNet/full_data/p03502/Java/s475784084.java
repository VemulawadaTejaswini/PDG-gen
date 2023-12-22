import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 8; i >= 0; i--) {
			sum+=(n%Math.pow(10, i+1))/Math.pow(10, i);
		}
		if(n%sum == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}