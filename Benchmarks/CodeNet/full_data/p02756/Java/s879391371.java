import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int Q = sc.nextInt();

		StringBuffer sb = new StringBuffer(S);
		boolean reverse = false;
		
		for (int i=0; i<Q; i++){
			int T = sc.nextInt();
			if (T == 1){
				reverse = !reverse;
			} else if (T == 2){
				int F = sc.nextInt();
				char C = sc.next().charAt(0);
				if ((F == 1 && !reverse) || (F == 2 && reverse)) {
					sb.insert(0, C);
				} else {
					sb.append(C);
				}
			}
		}
		if (reverse){
			sb.reverse();
		}
		System.out.println(sb.toString());
	}
}