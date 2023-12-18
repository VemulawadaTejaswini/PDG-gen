public class Main {
    public static void main(String[] args) {
        Scanner square = new Scanner(System.in).useDelimiter("\\s");
        int a = square.nextInt();
        int b = square.nextInt();
        System.out.println(a * b + " " + (2 * a + 2 * b));
    }
}
