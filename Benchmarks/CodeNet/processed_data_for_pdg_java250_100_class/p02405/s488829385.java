class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		while (true) {
			int h = scan.nextInt();
			int w = scan.nextInt();
			if (h == 0 && w == 0)
				break;
			if (h % 2 == 0 && w % 2 == 0) {
				for (int j = 0; j < h / 2; j++) { 
					for (int i = 0; i < w / 2; i++) {
						str.append("#.");
					}
					str.append("\n"); 
					for (int i = 0; i < w / 2; i++) {
						str.append(".#");
					}
					str.append("\n"); 
				}
			}
			if (h % 2 == 0 && w % 2 != 0) {
				for (int i = 0; i < h / 2; i++) { 
					str.append("#"); 
					for (int j = 0; j < (w - 1) / 2; j++) { 
						str.append(".#");
					}
					str.append("\n");
					str.append("."); 
					for (int j = 0; j < (w - 1) / 2; j++) {
						str.append("#."); 
					}
					str.append("\n");
				}
			}
			if (h % 2 != 0 && w % 2 == 0) {
				for (int i = 0; i < w/2; i++) {
					str.append("#."); 
				}
				str.append("\n");
				for (int j = 0; j < (h - 1) / 2; j++) { 
					for (int i = 0; i < w/2; i++) {
						str.append(".#"); 
					}
					str.append("\n");
					for (int i = 0; i < w/2; i++) {
						str.append("#."); 
					}
					str.append("\n");
				}
			}
			if (h % 2 != 0 && w % 2 != 0) {
				str.append("#"); 
				for (int i = 0; i < (w - 1) / 2; i++) {
					str.append(".#"); 
				}
				str.append("\n");
				for (int j = 0; j < (h - 1) / 2; j++) { 
					str.append("."); 
					for (int i = 0; i < (w - 1) / 2; i++) {
						str.append("#."); 
					}
					str.append("\n");
					str.append("#"); 
					for (int i = 0; i < (w - 1) / 2; i++) {
						str.append(".#"); 
					}
					str.append("\n");
				}
			}
			str.append("\n");
		}
		System.out.print(str);
	}
}
