import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int p[] = new int[M];
        String S[] = new String[M];

        for (int i = 0; i < M; i++) {
            p[i] = sc.nextInt();
            S[i] = sc.next();
        }

        int ansAC = 0;
        int ansWA = 0;

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < M; i++) {
            if (!(list.contains(p[i]))) {

                if (S[i].equals("AC")) {
                    ansAC += 1;
                    list.add(p[i]);
                } else {
                    ansWA += 1;
                }
            }
        }

        System.out.println(ansAC + " " + ansWA);

    }

}