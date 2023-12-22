import java.util.*;

public class Main {

	public static void main(String[] args) {
		int scc = 0;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		while (true) {
			if (N >= 1 && M >= 2) {
				scc++;
				N--;
				M -= 2;
			}
		
			else if (M >= 4) {
				scc++;
				M -= 4;
			}
		
			else break;
		}
		
		System.out.print(scc);
	}

}
