import java.util.*;
import static java.lang.System.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] point = new int[n];
		for(int i = 0; i < n; i++)
			point[i] = sc.nextInt();
		
		int cnt = 0;
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				cnt += point[i] * point[j];
			}
		}
		out.println(cnt);
		
	}
}