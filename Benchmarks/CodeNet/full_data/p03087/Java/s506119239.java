import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] temp = scanner.nextLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int q = Integer.parseInt(temp[1]);

		String s = scanner.nextLine();
		int[] ans = new int[q];

		for(int i = 0; i < q; i++) {

			String[] tmp = scanner.nextLine().split(" ");
			int a = Integer.parseInt(tmp[0]) - 1;
			int z = Integer.parseInt(tmp[1]) - 1;
				for(int j = a; j < z; j++) {
					String cha = String.valueOf(s.charAt(j));
					if(cha.equals("A")) {
						String chc = String.valueOf(s.charAt(j + 1));
						if(chc.equals("C")) {
							ans[i]++;
							j++;
						}
					}
				}
		}

		for(int a : ans) {
			System.out.println(a);
		}

	}
}

