import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<String> param = new ArrayList<String>();
		int system = 0; // 文字の空白区切り 0:ON 1:OFF

		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				num.add(sc.nextInt());
			} else {
				if (system == 0)
					param.add(sc.next());
				if (system == 1)
					param.add(sc.nextLine());
			}
		}
		Method(num, param);
	}

	static void Method(ArrayList<Integer> num, ArrayList<String> param) {

		int[][] area = new int[num.get(0)][num.get(1)];

		for (int i = 3; i < num.size() - 2; i += 3) {
			if (num.get(i + 2) == 1) {
				for (int j = 0; j < num.get(i); j++) {
					for (int k = 0; k < area[0].length; k++) {
						area[j][k] = 1;
					}
				}
			} else if (num.get(i + 2) == 2) {
				for (int j = num.get(i); j < area.length; j++) {
					for (int k = 0; k < area[0].length; k++) {
						area[j][k] = 1;
					}
				}
			} else if (num.get(i + 2) == 3) {
				for (int j = 0; j < area.length; j++) {
					for (int k = 0; k < num.get(i+1); k++) {
						area[j][k] = 1;
					}
				}
			} else if (num.get(i + 2) == 4) {
				for (int j = 0; j < area.length; j++) {
					for (int k = num.get(i+1); k < area[0].length; k++) {
						area[j][k] = 1;
					}
				}
			}
		}
		
		int count = 0;
		
		for (int i = area[0].length-1; i >= 0; i--) {
			//System.out.println();
			for (int j = 0; j < area.length; j++) {
				//System.out.print(area[j][i]);
				if(area[j][i] == 0) count++;
			}
		}
		System.out.println(count);
	}
}