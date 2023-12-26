public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cardN; 
		int win = 3, draw = 1; 
		String taro[], hanako[]; 
		int pointT = 0, pointH = 0;
		cardN = sc.nextInt(); 
		taro = new String[cardN];
		hanako = new String[cardN];
		for (int i = 0; i < cardN; i++) { 
			taro[i] = sc.next();
			hanako[i] = sc.next();
			int game = taro[i].compareToIgnoreCase(hanako[i]);
			if (game == 0) {
				pointT += draw;
				pointH += draw;
			} else if (game > 0) {
				pointT += win;
			} else {
				pointH += win;
			}
		}
		System.out.println(pointT + " " + pointH);
	}
}
