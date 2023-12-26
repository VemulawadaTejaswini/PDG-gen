public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> valList = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			valList.add(scanner.nextInt());
		}
		int k = scanner.nextInt();
		scanner.close();
		boolean canCommuFlg = true;
		for (int i = 1; i < valList.size(); i++) {
			if(canCommuFlg == false) break;
			for (int j = 0; j < i; j++) {
				if (valList.get(i) - valList.get(j) > k) {
					canCommuFlg = false;
					break;
				}
			}
		}
		if (canCommuFlg == true) {
			System.out.println("Yay!");
		} else {
			System.out.println(":(");
		}
	}
}
