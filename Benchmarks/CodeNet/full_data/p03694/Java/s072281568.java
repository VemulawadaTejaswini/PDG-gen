
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int max = a, min = a;
		
		for(int i = 1; i < n; i++) {
			a = sc.nextInt();
			if(min > a) {
				min = a;
			}else if(max < a) {
				max = a;
			}
		}
		System.out.print(max - min);
		
	}
}
