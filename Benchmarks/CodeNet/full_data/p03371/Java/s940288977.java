import java.io.InputStreamReader;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
		
		System.out.println(Math.min(
				Math.min(a * x + b * y, Math.min(x, y) * c * 2 + (x - Math.min(x, y)) * a + (y - Math.min(x, y)) * b),
				Math.max(x, y) * c * 2));
	}
}