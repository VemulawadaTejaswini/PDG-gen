import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		sc.nextLine();
		
		String[] map = new String[H];
		for (int i = 0; i < H; i++) {
			map[i] = sc.nextLine();
			if (!map[i].contains("#")) {
				String repeated = new String(new char[W]).replace("\0", " ");
				map[i] = repeated;
			}
		}
		
		for (int i = 0; i < W; i++) {
			boolean linedot = true;
			for (int j = 0; j < H; j++) {
				String s = map[j];
				
				if (s.charAt(i) == '#') {
					linedot = false;
					break;
				}
			}
			
			if (linedot) {
				for (int k = 0; k < H; k++) {
					String str = map[k];
					StringBuilder sb = new StringBuilder(str);
					sb.setCharAt(i, ' ');
					map[k] = sb.toString();
				}
			}
		}
		
		for (int i = 0; i < H; i++) {
			String ans = map[i].replaceAll(" ", "");
			if (ans.length() == 0) 
				continue;
			
			
			System.out.println(ans);
		}
		
	}
}