public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int takeCard = sc.nextInt();
		Integer[] arrayCard = new Integer[takeCard];
		int box = 0;
		int sumAlice = 0;
		int sumBob = 0;
		if(takeCard >= 1 && takeCard <= 100) {
			for(int i = 0; i < takeCard; i++) {
				arrayCard[i] = sc.nextInt();
			}
			Arrays.sort(arrayCard,Collections.reverseOrder());
			for(int i = 0; i < arrayCard.length; i++) {
				if((i == 0) || (i % 2 == 0)) {
					sumAlice += arrayCard[i];
				}else {
					sumBob += arrayCard[i];
				}
			}
			int ans = sumAlice - sumBob;
			System.out.println(ans);
		}else {
			System.out.print("制約NG");
		}
	    sc.close();
	}
}
