import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();
        int s = S.length();
        int t = T.length();
        int beginIndex = -1;
        for (int i = 0 ; i < s - t + 1 ; i++) {
            boolean match = true;
            for (int j = 0 ; j < t ; j++) {
                if (S.charAt(i + j) != '?' && S.charAt(i + j) != T.charAt(j)) {
                    match = false;
                }
            }
            if (match) {
                beginIndex = i;
                break;
            }
        }
        if (beginIndex != -1) {
            S = S.replace('?', 'a');
            StringBuilder sb = new StringBuilder(S);
            sb.replace(beginIndex, beginIndex + t, T);
            System.out.println(sb);
        } else {
            System.out.println("UNRESTORABLE");
        }

    }

}