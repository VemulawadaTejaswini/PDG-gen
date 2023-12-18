public class Main {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        String[] inputs = input.split("\\s+");
        List<String> sorted = Arrays.stream(inputs).sorted().collect(Collectors.toList());
        System.out.println(sorted.get(0) + " " + sorted.get(1) + " " + sorted.get(2));
    }
}
