import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kazu = sc.nextInt();
		int iro = sc.nextInt();
		int SUM = iro;

		for(int i = 1; i < kazu; i++) {
			SUM = SUM * (iro - 1);
		}
		System.out.print(SUM);
	}
}