public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cardSet;
		int shuffleM,shuffleH;
		while (true) {
			cardSet=sc.next();
			if(cardSet.equals("-"))break;
			shuffleM = sc.nextInt();
			for (int i = 0; i < shuffleM; i++) {
				shuffleH = sc.nextInt();
				cardSet = cardSet.substring(shuffleH) + cardSet.substring(0, shuffleH);
			}
			System.out.println(cardSet);
		}
	}
}
