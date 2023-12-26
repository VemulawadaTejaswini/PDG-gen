class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int time = sc.nextInt();
			int t_point = 0;
			int h_point = 0;
			for (int j = 0; j < time; j++) {
				ArrayList<String> cards = new ArrayList<>();
				String t_card = sc.next();
				cards.add(t_card);
				cards.add(sc.next());
				Collections.sort(cards);
				if(cards.get(0).contentEquals(cards.get(1))) {
					t_point++;
					h_point++;
				}else if(cards.get(0)==t_card) {
					h_point+=3;
				}else{
					t_point+=3;
				}
			}
			System.out.println(String.format("%d %d", t_point, h_point));
		}
	}
}
