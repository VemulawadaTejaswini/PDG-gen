import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Integer> goalA = new ArrayList<Integer>();
		ArrayList<Integer> startB = new ArrayList<Integer>();
		int aBuf = 0;
		int bBuf = 0;
		for(int i=0; i < m; i++) {
			aBuf = sc.nextInt();
			bBuf = sc.nextInt();
			if(aBuf==1) startB.add(bBuf);
			else if(bBuf==n) goalA.add(aBuf);
		}
		int possible = 0;
		for(int i=0; i < goalA.size(); i++) {
			for(int j=0; j < startB.size(); j++) {
				if(goalA.get(i)==startB.get(j)) {
					possible = 1;
				}
			}
		}
		if(possible == 1) System.out.println("POSSIBLE");
		else System.out.println("IMPOSSIBLE");
	}
}