import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int bo = sc.nextInt();
		boolean ans = true;
		for(int i = 1; i < N; i++) {
			int ne = sc.nextInt();
			if(bo - ne > 1 || bo - ne < -1 ) {
				ans = false;
				break;
			}
			bo = ne;
		}
		if(ans) System.out.println("Yes");
		else System.out.println("No");
	}
}