import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int K = sc.nextInt();

        String x = String.valueOf(S.charAt(K-1));
        StringBuffer ret = new StringBuffer();
        for (int i=0; i<N; i++) {
            if (String.valueOf(S.charAt(i)).equals(x)) {
                ret.append(x);
            } else {
                ret.append("*");
            }
        }
        System.out.println(ret);
    }
}
