public class Harmony {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();

        int k;

        for (k = 0; k < 1000000000; k++) {
            if (Math.abs(a - k) == Math.abs(b - k)) {
                System.out.println(k);
                return;
            }
        }
        System.out.println("IMPOSSIBLE");
    }
}