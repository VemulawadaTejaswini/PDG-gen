public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String out = "No";
        if (a == b && a != c) {
            out = "Yes";
        } else if (b == c && b != a) {
            out = "Yes";
        } else if (a == c && a != b) {
            out = "Yes";
        }
        System.out.println(out);
    }
}
