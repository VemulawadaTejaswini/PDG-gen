import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] count = new int[100003];
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			count[a]++;
			count[a+1]++;
			count[a+2]++;
		}
		sc.close();
		
		Arrays.sort(count);
		
		System.out.println(count[100002]);

	}

}
