public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> input = new ArrayList<>();
		while(true) {
			int num = sc.nextInt();
			if(num != 0) {
				input.add(num);
			} else {
				break;
			}
		}
		for(int i = 0; i < input.size(); i++) {
			System.out.println("Case " + String.valueOf(i+1) + ": " + input.get(i));
		}
	}
}
