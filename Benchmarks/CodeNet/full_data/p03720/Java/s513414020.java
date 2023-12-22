import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		int a, b;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		
		int[] city = new int[n];
		for(int i : city) i = 0;
		for(int i = 0; i < m; i++) {
			a = s.nextInt();
			b = s.nextInt();
			city[a-1]++;
			city[b-1]++;
		}
		
		for(int i = 0; i < n; i++) System.out.println(city[i]);
	}

}
