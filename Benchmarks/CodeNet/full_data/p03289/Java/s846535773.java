public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(scanner.next().matches("A[a-z]+C[a-z]+") ? "AC" : "WA");
    }
}