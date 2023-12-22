import java.util.Scanner;
public class A {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(b - a == c - b) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}
}
