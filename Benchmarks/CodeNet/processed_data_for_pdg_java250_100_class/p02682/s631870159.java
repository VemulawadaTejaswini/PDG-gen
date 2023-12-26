public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        sc.close();
        int result = 0;
        if (k <= a) {
            result = k;
        } else if (k <= a + b) {
            result = a;
        } else {
            result = a - (k - (a + b));
        }
        System.out.println(result);
    }
}
