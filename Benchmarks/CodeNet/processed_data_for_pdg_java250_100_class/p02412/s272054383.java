public class Main{
	public static void main(String[] args) {
		int all_number = 0;
		int answer = 0;
		String out_all = "";
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			all_number = sc.nextInt();
			answer = sc.nextInt();
			if (all_number == 0 && answer == 0)
				break;
			int out = 0;
			for (int f = 1; f <= all_number; f++) {
				for (int s = 1; s <= all_number; s++) {
					if (s != f) {
						for (int t = 1; t <= all_number; t++) {
							if (s != f && f != t && t != s && s + f + t == answer) {
								out = 1 + out;
							}
						}
					}
				}
			}
			out = out / 6;
			out_all = out_all+""+String.valueOf(out)+"\n";
		}
		System.out.print(out_all);
	}
}
