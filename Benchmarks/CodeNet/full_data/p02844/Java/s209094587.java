import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int N = Integer.parseInt(sc.next());
        final String S = sc.next();
        sc.close();

        Set<String> set = new HashSet<>();

        for (int i=0; i<N-2; i++) {
            for (int j=i+1; j<N-1; j++) {
                for (int k=j+1; k<N; k++) {
                    String T = S.substring(i, i+1) + S.substring(j, j+1) + S.substring(k, k+1);
                    set.add(T);
                }
            }
        }

        System.out.println(set.size());
    }
}