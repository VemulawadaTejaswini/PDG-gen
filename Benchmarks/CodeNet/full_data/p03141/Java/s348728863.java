import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> takahashi = new ArrayList<>();
		ArrayList<Integer> aoki = new ArrayList<>();
		for(int i =0; i< N; i++) {
			takahashi.add(sc.nextInt());
			aoki.add(sc.nextInt());
		}

		long takahashiP = 0;
		long aokiP = 0;
		while(true) {
			int takahashiMax = 0;
			int maxIndex = 0;
			int kouho = 0;
			int kouhoindex = 0;
			for(int t = 0; t < takahashi.size(); t++) {
				if(takahashiMax < takahashi.get(t)) {
					takahashiMax = takahashi.get(t);
					maxIndex = t;
				}
				if(takahashi.get(t) < aoki.get(t)) {
					if(kouho < aoki.get(t) - takahashi.get(t)) {
						kouho = aoki.get(t) - takahashi.get(t);
						kouhoindex = t;
					}
//					kouho = aoki.get(t) - takahashi.get(t);
//					kouhoindex = t;
				}
			}
			if(kouho == 0) {
				//相手が最大になるものがなかった
				takahashiP += takahashiMax;
				takahashi.remove(maxIndex);
				aoki.remove(maxIndex);
			}else {
				takahashiP += takahashi.get(kouhoindex);
				takahashi.remove(kouhoindex);
				aoki.remove(kouhoindex);
			}

			if(takahashi.isEmpty()) {
				break;
			}

			int aokiMax = 0;
			int aokimaxIndex = 0;
			int aokikouho = 0;
			int aokikouhoindex = 0;
			for(int a = 0; a < aoki.size(); a++) {
				if(aokiMax < aoki.get(a)) {
					aokiMax = aoki.get(a);
					aokimaxIndex = a;
				}
				if(aoki.get(a) < takahashi.get(a)) {
					if(kouho < takahashi.get(a) - aoki.get(a)) {
						aokikouho = takahashi.get(a) - aoki.get(a);
						aokikouhoindex = a;
					}
				}
			}

			if(aokikouho == 0) {
				//相手が最大になるものがなかった
				aokiP += aokiMax;
				aoki.remove(aokimaxIndex);
				takahashi.remove(aokimaxIndex);
			}else {
				aokiP += aoki.get(aokikouhoindex);
				aoki.remove(aokikouhoindex);
				takahashi.remove(aokikouhoindex);
			}

			if(takahashi.isEmpty()) {
				break;
			}

		}

        System.out.println(takahashiP - aokiP);
	}

}