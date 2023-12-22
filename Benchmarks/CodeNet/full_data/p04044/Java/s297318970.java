import java.util.Scanner;

/**
 * ABC042B
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();

        /** 空読み */
        sc.nextLine();

        String[] strs = new String[N];
        String ans = "";

        for (int i = 0; i < N; i++) {
            strs[i] = sc.nextLine();
        }

        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N - 1; i++) {
                for (int j = 0; j < L; j++) {
                    if (strs[i].charAt(j) > strs[i + 1].charAt(j)) {
                        String temp = strs[i];
                        strs[i] = strs[i + 1];
                        strs[i + 1] = temp;
                        break;
                    } else if (strs[i].charAt(j) == strs[i + 1].charAt(j)) {
                        continue;
                    }
                }
            }
        }
        
        for (int i = 0; i < strs.length; i++) {
            ans += strs[i];
        }
        System.out.println(ans);
    }
}