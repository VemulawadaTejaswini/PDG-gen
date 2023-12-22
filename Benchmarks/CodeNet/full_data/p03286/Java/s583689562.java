import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (n % 2 == 0) {

                sb.insert(0, 0);
                n = n / (-2);
            } else {

                sb.insert(0, 1);
                n = n > 0 ? n / (-2) : (n - 1) / (-2);
            }
            if (n == 0) {
                break;
            }

        }
        System.out.println(sb.toString());
    }
}
