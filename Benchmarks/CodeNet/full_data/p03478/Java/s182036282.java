import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int res = 0;
        for (int i=0; i<=N; i++) {
            String[] a = String.valueOf(i).split("");
            int tmp = 0;
            for (String b : a) {
                tmp += Integer.parseInt(b);
            }
            if (tmp >= A && tmp <= B) {
                res += i;
            }
        }
        System.out.println(res);
    }
}
