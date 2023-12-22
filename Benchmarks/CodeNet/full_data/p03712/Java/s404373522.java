import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),b = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<b+2; i++) {
			sb.append("#");
		}
		System.out.println(sb.toString());
		for(int i=0; i<a; i++) {
			System.out.println("#"+sc.next()+"#");
		}
		System.out.println(sb.toString());
	}
}
