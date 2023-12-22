public class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(multiply(a, b));
    }

    private static String multiply(int a, int b) {
        return (a * b) % 2 == 0 ? "Even" : "Odd";
    }
}