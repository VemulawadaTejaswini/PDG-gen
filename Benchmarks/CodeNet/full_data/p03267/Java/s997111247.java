import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		sc.close();
		StringBuilder sb = new StringBuilder();
		int points = L + 1, edge = 2 * L - 1; 
		sb.append(points + " " + edge + "\n");
		for(int i=1;i<=L;i++) {
			sb.append(i + " " + (i+1) + " 1" + "\n");
		}
		for(int i=1;i<L;i++) {
			sb.append(i + " " + (L+1) + " 0" + "\n");
		}
		System.out.println(sb.toString());
	}
}