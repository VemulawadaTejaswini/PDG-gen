package atcoder;

import java.util.Scanner;

public class F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int nNum = in.nextInt();
		int cnt4 = 0;
		int cnt2 = 0;
		while(in.hasNextInt()) {
			int val = in.nextInt();
			if(val % 4 == 0)
				cnt4++;
			if(val % 4 != 0 && val % 2 == 0)
				cnt2++;
		}
		nNum -= cnt2 / 2;
		if(nNum / 2 <= cnt4)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
