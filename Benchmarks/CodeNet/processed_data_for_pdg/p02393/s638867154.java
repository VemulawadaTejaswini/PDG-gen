public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.next());
        int b = Integer.parseInt(scan.next());
        int c = Integer.parseInt(scan.next());
        if (a <= b && a <= c && b <= c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a <= b && a <= c && c <= b) {
            System.out.println(a + " " + c + " " + b);
        } else if (b <= a && b <= c && a <= c) {
            System.out.println(b + " " + a + " " + c);
        } else if (b <= a && b <= c && c <= a) {
            System.out.println(b + " " + c + " " + a);
        } else if (c <= a && c <= b && a <= b) {
            System.out.println(c + " " + a + " " + b);
        } else if (c <= a && c <= b && b <= a) {
            System.out.println(c + " " + b + " " + a);
        }
    }
}
