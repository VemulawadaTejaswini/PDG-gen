
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		String S = sc.next();
		List<Integer> stone = new ArrayList<>();
		List<Integer> skip = new ArrayList<>();
		boolean sto = false;
		int count = 0;
		for(int i = 1; i < S.length() + 1; i++) {
			if(S.charAt(i) == '.') {
				count++;
				if(count >= 3) {
					skip.add(i - 1);
				}
				sto = false;
			} else {
				count = 0;
				if(sto) {
					stone.add(i);
				} else {
					sto = true;
				}
			}
		}
		boolean overstone = true;
		boolean AoverB = false;
		for(Integer i : stone) {
			if((A < i && i < C) || (B < i && i < D)) {
				overstone = false;
				break;
			}
		}
		for(Integer i : skip) {
			if(B <= i) {
				AoverB = true;
				break;
			}
		}
		if(overstone && (C < D || AoverB)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
