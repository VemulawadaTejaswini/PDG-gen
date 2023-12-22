import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();

		String masu = "";
		ArrayList<String> list1 = new ArrayList<String>();
		int cnt = 0;
		// 横
		for (int i = 0; i < H; i++) {
			masu = sc.next();
			for (int j = 0; j < W; j++) {
				if (String.valueOf(masu.charAt(j)).equals("#")) {
					list1.add(masu);
					break;
				}
			}
		}
		H = list1.size();
		String str = "";
		// 縦
		for (int i = 0; i < W; i++) {
			cnt = 0;
			for (int j = 0; j < H; j++) {
				if (String.valueOf(list1.get(j).charAt(i)).equals(".")) {
					cnt++;
				}
			}
			if (cnt == H) {
				for (int k = 0; k < H; k++) {
					str = "";
					for (int l = 0; l < W; l++) {
						if (l != i) {
							str += String.valueOf(list1.get(k).charAt(l));
						}
					}
					list1.set(k, str);
				}
				W--;
			}
		}

		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}

		sc.close();
	}

}