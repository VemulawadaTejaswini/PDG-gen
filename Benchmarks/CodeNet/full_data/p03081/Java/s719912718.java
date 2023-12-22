import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int Q = scn.nextInt();
		scn.nextLine();
		char[] str = scn.nextLine().toCharArray();
		ArrayList<Character> chList = new ArrayList<Character>();
		for(int i = 0;i < N;i++) {
			chList.add(str[i]);
		}

		char[][] QList = new char[Q][2];

		for(int i = 0;i < Q;i++) {
			char ch1 = scn.next().toCharArray()[0];
			char ch2 = scn.next().toCharArray()[0];
			QList[i][0] = ch1;
			QList[i][1] = ch2;
		}

		for(int i = Q-1;i >= 0; i--) {
			char ch1 = QList[i][0];
			char ch2 = QList[i][1];

			if(ch2 == 'L') {
				if(chList.get(0) == ch1) {
					chList.remove(0);
				}
			}else {
				if(chList.get(chList.size()-1) == ch1) {
					chList.remove(chList.size()-1);
				}
			}
		}
		System.out.println(chList.size());

	}

}
