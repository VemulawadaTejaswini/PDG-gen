import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        if (n == 1) {
            sb.append(sc.next());
        } else {

            for (int i = 0; i < n; i++) {
                sb.append(sc.next());
                sb.reverse();
                sb.append(" ");
            }
        }
        sc.close();

        System.out.println(sb.toString());
    }
}