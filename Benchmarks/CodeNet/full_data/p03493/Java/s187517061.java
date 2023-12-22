import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = 0;
		
		if(a == 1) {
			d++;
		}
		
		if(b == 1) {
			d++;
		}
		
		if(c == 1) {
			d++;
		}
		
		System.out.println(d);
		
		
		sc.close();
	}
}
