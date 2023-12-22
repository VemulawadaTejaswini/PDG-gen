public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        int c = Integer.parseInt(scanner.next());
        int d = Integer.parseInt(scanner.next());
        int sum = 0;
        if (a <= b) {
            sum += a;
        } else {
            sum += b;
        }

        if (c <= d) {
            sum += c;
        } else {
            sum += d;
        }
        System.out.println(sum);
    }
}
