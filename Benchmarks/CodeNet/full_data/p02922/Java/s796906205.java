import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
 
		int a,b;
 
		Scanner sc = new Scanner(System.in);
 
		a = sc.nextInt();
		b = sc.nextInt();
 
		int count = 1;
		int result = a;
 
		while (result <= b) {
			result += a - 1;
			++count;
		}
 
		System.out.println(count);
 
	}
}