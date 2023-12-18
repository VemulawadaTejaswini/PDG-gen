public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        for (int i = 0; i < 2; i++) {
            if (a > b) {
                int t = a;
                a = b;
                b = t;
            }
            if (b > c) {
                int t = b;
                b = c;
                c = t;
            }
        }
        System.out.println(a + " " + b + " " + c);
        scn.close();
    }
}
