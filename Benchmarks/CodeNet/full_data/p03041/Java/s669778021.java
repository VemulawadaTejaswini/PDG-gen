import java.util.*;

class Main {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String str = sc.next();
        char[] S = new char[N];

        for (int i=0; i<N; i++) {
            S[i] = str.charAt(i);
        }

        for (int i=0; i<N; i++) {
            if (i == K-1) {
                System.out.print((char)(S[i] + 32));
            } else {
                System.out.print(S[i]);
            }
        }
    }
}
