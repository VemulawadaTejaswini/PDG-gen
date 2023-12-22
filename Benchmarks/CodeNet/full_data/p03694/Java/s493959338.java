import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int max = a, min = a;
		for(int i = 0; i < n - 1; i++) {
			a = sc.nextInt();
			if(a > max) max = a;
			else if(a < min) min = a;
		}
		System.out.println(max - min);
	}
}
