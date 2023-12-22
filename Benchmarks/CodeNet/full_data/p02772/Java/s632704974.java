public class Main {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        // 数値
        int n1 = sc.nextInt();
        boolean flg = false;
        for (int i = 1; i <= n1; i++) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                if (!(n % 3 == 0 || n % 5 == 0)) {
                    flg = true;
                    break;
                }
            }
        }

        if (flg) {
            System.out.println("DENIED");
        } else {
            System.out.println("APPROVED");
        }

    }
}
