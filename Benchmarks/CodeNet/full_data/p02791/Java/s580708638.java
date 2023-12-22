import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] P = new int[N];

        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            boolean isOK = true;

            for (int j = i; j >= 0; j--) {
                if (P[i] > P[j]) {
                    isOK = false;
                    j = -1;
                }
            }
            if (isOK){
                ans++;
            }
        }
        System.out.println(ans);
    }

}




