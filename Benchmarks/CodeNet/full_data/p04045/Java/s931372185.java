import java.util.Scanner;

/**
 * ABC042C
 */
public class ABC042C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        boolean[] dislike = new boolean[10];
        for (int i = 0; i < dislike.length; i++) {
            dislike[i] = false;
        }

        for (int i = 0; i < K; i++) {
            dislike[sc.nextInt()] = true;
        }

        String str_N = Integer.toString(N);
        String ans = "";
        
        int i = str_N.length() - 1;
        while (i >= -1) {
            int sequence = 1;
            if (i != -1) {
                sequence = str_N.charAt(i) - '0';
            }
            for (int j = 0; j < 10; j++) {
                if (dislike[(sequence + j) % 10])
                    continue;

                ans += Integer.toString((sequence + j) % 10);
                break;
            }

            if (i == 0 && ans.charAt(str_N.length() - 1) >= str_N.charAt(str_N.length() - 1))
                break;

            i--;
        }
        
        StringBuffer buf = new StringBuffer(ans);
        ans = buf.reverse().toString();

        System.out.println(ans);
    }
}