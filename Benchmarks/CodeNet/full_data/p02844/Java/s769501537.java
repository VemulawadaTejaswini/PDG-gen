import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Main mainObj = new Main();
		mainObj.solve();
	}
	
	public void solve() {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String seq = sc.nextLine();
		sc.close();
		
		ArrayList<ArrayList<Integer>> numPosList = new ArrayList<>(10);
		for(int i = 0; i < 10; i++) {
			numPosList.add(new ArrayList<>());
		}
		
		for(int i = 0; i < n; i++) {
			int charAtI = seq.charAt(i) - 48;
			numPosList.get(charAtI).add(new Integer(i));
		}
		
		int ans = 0;
		int iPos,jPos,kPos;
		for(int i = 0; i < 10; i++) {
			
			ArrayList<Integer> firstList= numPosList.get(i);
			if(firstList.size() == 0) {
				continue;
			}else {
				iPos = firstList.get(0);
			}
			for(int j = 0; j < 10; j++) {
				
				ArrayList<Integer> secondList = numPosList.get(j);
				jPos = 0;
				for(int l = 0; l < secondList.size(); l++) {
					int candSecondPos = secondList.get(l);
					if(candSecondPos > iPos) {
						jPos = candSecondPos;
						break;
					}
				}
				if(jPos <= iPos) {
					continue;
				}
				
				for(int k = 0; k < 10; k++) {
					ArrayList<Integer> thirdList = numPosList.get(k);
					kPos = 0;
					for(int m = 0; m < thirdList.size(); m++) {
						int candThirdPos = thirdList.get(m);
						if(candThirdPos > jPos) {
							kPos = candThirdPos;
							break;
						}
					}
					if(kPos > jPos) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}

}
