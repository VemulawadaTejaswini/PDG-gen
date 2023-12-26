public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		sb.append("");
		int h, w;
		while (true) {
			h = scan.nextInt();
			w = scan.nextInt();
			if((h == 0) & (w == 0)){break;}
			for (int count = 0; count < h; count++) {
				for (int count2 = 0; count2 < w; count2++) {
					sb.append("#");
				}
				sb.append("\n");
			}
			System.out.println(new String(sb));
			sb.delete(0, sb.length());
		}
	}
}
