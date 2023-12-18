public class Main {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (Scanner.hasNext()) {
            int input = Integer.parseInt(Scanner.next());
            if (input == 0) {
                break;
            }
            list.add(input);
        }
        IntStream.range(0, list.size())
                .forEach(i -> System.out.println("Case" + " " + (i + 1) + ": " + list.get(i)));
    }
}
