import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();
        sc.close();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            char s = S.charAt(i);
            if (i == K - 1) {
                switch (String.valueOf(s)) {
                    case "A":
                        sb.append("a");
                        break;
                    case "B":
                        sb.append("b");
                        break;
                    case "C":
                        sb.append("c");
                        break;
                    default:
                        continue;
                }
            } else {
                sb.append(String.valueOf(s));
            }
        }

        System.out.println(sb.toString());

    }
}
