public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int xMax = Math.max(x, java.util.stream.IntStream.range(0, n).map(i -> scanner.nextInt()).max().orElse(-100));
        int yMax = Math.min(y, java.util.stream.IntStream.range(0, m).map(i -> scanner.nextInt()).min().orElse(100));
        System.out.println(xMax < yMax ? "No War" : "War");
    }
}