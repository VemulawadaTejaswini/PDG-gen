import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] S = sc.next().toCharArray();
        char[] T = sc.next().toCharArray();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < N; i++) {
            ans.append(S[i]).append(T[i]);
        }

        System.out.println(ans.toString());
    }
}
