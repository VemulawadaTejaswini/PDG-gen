public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while(true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            System.out.println(String.format("Case %d: %s", count, input));
            count++;
        }
    }
}
