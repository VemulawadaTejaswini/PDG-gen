import java.util.Scanner;

/**
 * ABC042C
 */
public class Main {

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
        for (int i = 0; i < str_N.length(); i++) {
            for (int j = 0; j < 10; j++) {
                if (dislike[j])
                    continue;

                if (str_N.charAt(i) <= Integer.toString(j).charAt(0)) {
                    ans += Integer.toString(j);
                    break;
                }
            }
        }
        
        System.out.println(ans);
    }
}