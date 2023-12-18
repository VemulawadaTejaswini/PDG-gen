public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(Integer.valueOf(scanner.nextInt()));
		list.add(Integer.valueOf(scanner.nextInt()));
		list.add(Integer.valueOf(scanner.nextInt()));
		Collections.sort(list);
		System.out.println(list.get(0) + " " + list.get(1) + " " + list.get(2));
	}
}
