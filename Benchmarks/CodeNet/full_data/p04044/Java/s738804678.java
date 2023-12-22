import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String S[] = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.nextLine();
        }
        for (int i = 0; i < N-1; i++) {
            boolean flag = S[i].compareTo(S[i+1]) > 0;
            if (flag) {
                String tmp;
                tmp = S[i];
                S[i] = S[i+1];
                S[i+1] = tmp;
            }
        }
        StringBuffer buf = new StringBuffer("");
        for (int i = 0; i < N; i++) {
            buf.append(S[i]);
        }
        System.out.println(buf);
        sc.close();
    }   
}