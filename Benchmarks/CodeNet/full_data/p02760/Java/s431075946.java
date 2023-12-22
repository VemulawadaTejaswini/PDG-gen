import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		int M = Integer.parseInt(sc.next());
//		String S = sc.next();
		List<Integer> bingoList = new ArrayList();
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				int a = Integer.parseInt(sc.next());
				bingoList.add(a);
			}
		}
		int N = Integer.parseInt(sc.next());
		for(int i=1; i<=N; i++) {
			int aa = Integer.parseInt(sc.next());
			int bb = bingoList.indexOf(aa);
			if(bb != -1) {
				bingoList.set(bb, 0);
			}
		}
		if(bingoList.get(0)+bingoList.get(1)+bingoList.get(2) == 0 ||
		   bingoList.get(3)+bingoList.get(4)+bingoList.get(5) == 0 ||
		   bingoList.get(6)+bingoList.get(7)+bingoList.get(8) == 0 ||
		   bingoList.get(0)+bingoList.get(3)+bingoList.get(6) == 0 ||
		   bingoList.get(1)+bingoList.get(4)+bingoList.get(7) == 0 ||
		   bingoList.get(2)+bingoList.get(5)+bingoList.get(8) == 0 ||
		   bingoList.get(0)+bingoList.get(4)+bingoList.get(8) == 0 ||
		   bingoList.get(2)+bingoList.get(4)+bingoList.get(6) == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
