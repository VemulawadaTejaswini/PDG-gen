import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = sc.nextInt();
		boolean ans = true;
		for(int i = 1; i < N; i++) {
			int ne = sc.nextInt();
			if(max - ne > 1) {
				ans = false;
				break;
			}else if(max < ne) {
				max = ne;
			}
		}
		if(ans) System.out.println("Yes");
		else System.out.println("No");
	}
}