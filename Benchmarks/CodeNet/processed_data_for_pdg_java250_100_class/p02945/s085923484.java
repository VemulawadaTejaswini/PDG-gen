public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int a = stdin.nextInt();
        int b = stdin.nextInt();
        int c = IntStream.of(a + b, a - b, a * b).max().getAsInt();
        System.out.println(c);
    }
}
