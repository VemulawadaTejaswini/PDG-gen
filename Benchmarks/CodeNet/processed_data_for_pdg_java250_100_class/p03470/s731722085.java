public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputNumSize = sc.nextInt();
		HashMap<Integer,Integer> inputNumMap = new HashMap<>();
		for(int i=1;i <= inputNumSize;i++) {
			inputNumMap.put(sc.nextInt(), i);
		}
		sc.close();
		System.out.println(inputNumMap.size());
	}
}
