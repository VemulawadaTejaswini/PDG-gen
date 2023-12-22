import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		//StringBuilder s = new StringBuilder();
		String[] s = new String[n];
		int[] countS = new int[n]; //かぶった回数
		for (int i = 0; i < n; i++) {
			String tempS = scan.next();
			if (Arrays.asList(s).contains(tempS)) {
				s[i] = tempS;
				countS[i]++;
			} else {
				s[i] = tempS;
				countS[i]=0;
			}
		}
		//countS[i]内で最大のもののi＝forのi回目で入力したモノ
		int m = scan.nextInt();
		String[] t = new String[m];
		int[] countT = new int[m]; //かぶった回数
		for (int i = 0; i < m; i++) {
			String tempT = scan.next();
			if (Arrays.asList(t).contains(tempT)) {
				t[i] = tempT;
				countT[i]++;
			} else {
				t[i] = tempT;
				countT[i]=0;
			}
		}
		List<String> listS = Arrays.asList(s);
		List<String> listT = Arrays.asList(t);
		//System.out.println(listS);
		//System.out.println(listT);

		int plus[] =new int[n];
		int minus[] = new int[m];
		for(int i=0;i<listS.size();i++) {
			List<String>zanteiS = new ArrayList<>(listS);
			List<String>deleteS = new ArrayList<>();
			deleteS.add(listS.get(i));
			zanteiS.removeAll(deleteS);
			plus[i]=listS.size()-zanteiS.size();
		//	System.out.println(plus[i]);
		}

		for(int i=0;i<listT.size();i++) {
			List<String>zanteiT = new ArrayList<>(listT);
			List<String>deleteT = new ArrayList<>();
			deleteT.add(listT.get(i));
			zanteiT.removeAll(deleteT);
			minus[i]=listT.size()-zanteiT.size();
			//System.out.println(minus[i]);
		}

		int[] count = new int[listS.size()];
		for(int i=0;i<listS.size();i++) {
			count[i] = plus[i];

			for(int l=0;l<listT.size();l++) {
				if(listT.get(l).equals(listS.get(i))) {
					count[i] --;
				}
			}
//System.out.println("count"+count[i]);
		}
int ans =0;
		for(int i=0;i<count.length;i++) {
			ans = Math.max(count[i], ans);
		}
		System.out.println(ans);
		/*
		//plus内の最大値は
		int plusMax =0;
		for(int i=0;i<plus.length;i++) {
			plusMax=Math.max(plusMax, plus[i]);
		}
System.out.println(plusMax);

int minusMin =0;
for(int i=0;i<minus.length;i++) {
	minusMin=Math.min(minusMin, minus[i]);
}
System.out.println(minusMin);

*/

	}

}
