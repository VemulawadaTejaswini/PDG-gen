public class Main {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int x;
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (a > b) {
            x = a;
            a = b;
            b = x;
            if (b > c) {
                x = b;
                b = c;
                c = x;
                if (a > b) {
                    x = a;
                    a = b;
                    b = x;
                }
            }
        }else if (b > c) {
                x = b;
                b = c;
                c = x;
                if (a > b) {
                    x = a;
                    a = b;
                    b = x;
                }
            }
        System.out.println(a + " " + b + " " + c);
    }
}
