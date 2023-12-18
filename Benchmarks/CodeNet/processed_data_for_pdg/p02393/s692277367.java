public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b) {
            int z;
            z = a; a = b; b = z;
        } if (b > c) {
            int y;
            y = b; b = c; c = y;
        } if (b < a) {
            int x;
            x = b; b = a; a = x;
        }
        System.out.println(a + " " + b + " " + c);
    }
}
