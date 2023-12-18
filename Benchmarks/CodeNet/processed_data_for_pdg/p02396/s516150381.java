public class Main {
	public static void main(String[] args) {
		Scanner sc = null;
		ArrayList<Integer> array = new ArrayList<Integer>();
		int number = 0;
		sc = new Scanner(System.in);
		while (sc.hasNext()) {
			number = sc.nextInt();
			if (number == 0)
				break;
			array.add(number);
		}
		for (int i = 0; i < array.size(); i++) {
			System.out.println("Case " + (i+1) + ": " + array.get(i));
		}
	}
}
