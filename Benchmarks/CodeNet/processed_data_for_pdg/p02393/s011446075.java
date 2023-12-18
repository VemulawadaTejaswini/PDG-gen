public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] input = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		sc.close();
		Arrays.sort(input);
		StringJoiner sj = new StringJoiner(" ");
		for(int i : input) {
			sj.add(String.valueOf(i));
		}
		System.out.println(sj.toString());
	}
}
