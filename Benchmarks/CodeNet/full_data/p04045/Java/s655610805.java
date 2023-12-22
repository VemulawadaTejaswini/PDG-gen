import java.util.*;
public class Main{
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			String n = s.next();
			int k = s.nextInt();
			boolean[] d = new boolean[10];
			for (int i = 0; i < k; i++) {
				d[s.nextInt()] = true;
			}
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n.length(); i++) {
				int c = Integer.parseInt(n.substring(i, i + 1));
				if (d[c] == false) {
					sb.append(c);
					continue;
				}
				for (int j = c + 1; j < d.length; j++) {
					if (d[j] == false) {
						sb.append(j);
					}
				}
				break;
			}
			int len = n.length() - sb.length();
			for (int i = 0; i < len; i++) {
				sb.append('0');
			}
			System.out.println(sb);
		}
	}
}
