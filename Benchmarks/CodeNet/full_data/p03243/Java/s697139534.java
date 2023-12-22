import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		System.out.println(N%111==0?N:N+111-(N%111));
	}
}
