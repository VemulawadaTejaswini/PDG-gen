import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int a = A+B;
		int b = A-B;
		int c = A*B;
		
		int[] i = new int[3];
		i[0] = a;
		i[1] = b;
		i[2] = c;
		
		Arrays.sort(i);
		System.out.println(i[2]);
		
		sc.close();	
	}
}