import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println((n%100 <= (n/100)*11)? (n/100)*111 : ((n/100)+1)*111);
		
	}
}
