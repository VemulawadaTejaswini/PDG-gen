public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> inputs = new ArrayList<>();
		while(true) {
			int i = sc.nextInt();
			if(i == 0) break;
			inputs.add(i);
		}
		sc.close();
		int cases = 1;
		for(int i : inputs) {
			System.out.println("Case " + cases + ": " + i);
			cases++;
		}
	}
}
