import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt(), B = s.nextInt(), C = s.nextInt();
		int x = 0, y = 0, z = 0;
		if(A == B) x++;
		if(B == C) y++;
		if(C == A) z++;
		int r = x + y + z;
		System.out.println(r == 1 ? "Yes" : "No");
	}
}