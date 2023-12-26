public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int student = sc.nextInt();
		TreeMap<Integer, Integer> studentMap = new TreeMap<>();
		for (int studentNum = 1 ; studentNum <= student ; studentNum++) {
			studentMap.put(sc.nextInt(), studentNum);
		}
		for (int key : studentMap.keySet()) {
			System.out.print(studentMap.get(key) + " ");
		}
		sc.close();
	}
}
