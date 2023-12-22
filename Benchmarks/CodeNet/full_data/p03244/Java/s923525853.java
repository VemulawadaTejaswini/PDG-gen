import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		HashMap<Integer, Integer> mapEv = new HashMap<>();
		HashMap<Integer, Integer> mapOd = new HashMap<>();
		ArrayList<Integer> evlist = new ArrayList<>();
		ArrayList<Integer> odlist = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			if (i%2 == 0) {
				int num = sc.nextInt();
				if (mapEv.containsKey(num)) {
					int cnt = mapEv.get(num);
					mapEv.put(num, cnt+1);
				} else {
					mapEv.put(num, 1);
					evlist.add(num);
				}
			} else {
				int num = sc.nextInt();
				if (mapOd.containsKey(num)) {
					int cnt = mapOd.get(num);
					mapOd.put(num, cnt+1);
				} else {
					mapOd.put(num, 1);
					odlist.add(num);
				}
			}
		}

		int Amax1Number = 0;
		int Amax2Number = 0;
		int Amax1 = 0;
		int Amax2 = 0;

		int Bmax1Number = 0;
		int Bmax2Number = 0;
		int Bmax1 = 0;
		int Bmax2 = 0;
		int ans = 0;

		//パターンA
		for (int i = 0; i < evlist.size(); i++) {
			int tmp = mapEv.get(evlist.get(i));
			if (Amax1 <= tmp) {
				Amax2 = Amax1;
				Amax1 = tmp;
				Amax2Number = Amax1Number;
				Amax1Number = evlist.get(i);
			} else if (Amax2 <= tmp) {
				Amax2 = tmp;
			}
		}
		//パターンB
		for (int i = 0; i < odlist.size(); i++) {
			int tmp = mapOd.get(odlist.get(i));
			if (Bmax1 <= tmp) {
				Bmax2 = Bmax1;
				Bmax1 = tmp;
				Bmax2Number = Bmax1Number;
				Bmax1Number = odlist.get(i);
			} else if (Bmax2 <= tmp) {
				Bmax2 = tmp;
			}
		}
		if (Amax1Number == Bmax1Number) {
			//どちらの場合が良いか判定
			if (Amax1 + Bmax2 < Amax2 + Bmax1) {
				ans = n - Amax2 - Bmax1;
			} else {
				ans = n - Amax1 - Bmax2;
			}
		} else {
			ans = n - Amax1 - Bmax1;
		}
		System.out.println(ans);
	}
}
