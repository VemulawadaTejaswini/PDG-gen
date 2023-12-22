import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static int intN =0;
	static int sosuCnt =0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		//String[] h1 = sc.nextLine().split(" ");
		String[] arrayS = s.split("");
		String[] arrayT = t.split("");


		HashMap taiouMap = new HashMap();
		//int cnt =0;
		String alph = "abcdefghijklmnopqrstuvwxyz";
		String result = "Yes";
		for (int i = 0; i < t.length(); i++) {
			String tempT = arrayT[i];

			if (!taiouMap.containsKey(tempT)) {
				taiouMap.put(tempT,arrayS[i]);

				if (alph.contains(arrayS[i])) {
					alph.replace(tempT, "");
				} else {
					result = "No";
					break;
				}

			} else {
				if (!(taiouMap.get(tempT)).equals(arrayS[i])) {
					result = "No";
					break;
				};
			}
		}

		System.out.println(result);
	}

}