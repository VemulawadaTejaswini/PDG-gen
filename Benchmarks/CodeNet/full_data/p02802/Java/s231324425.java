import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] p = new int[M];
            String[] S = new String[M];
            for (int i = 0; i < M; i++) {
                p[i] = sc.nextInt();
                S[i] = sc.next();
            }

            HashSet<Integer> setAC = new HashSet<Integer>();
            for (int i = 0; i < M; i++) {
                if (S[i].equals("AC")) {
                    setAC.add(p[i]);
                }
            }

            HashSet<Integer> setAC2 = new HashSet<Integer>();
            int countWA = 0;
            for (int i = 0; i < M; i++) {
                if (setAC.contains(p[i]) && !setAC2.contains(p[i])) {
                    if (S[i].equals("WA")) {
                        countWA++;
                    }
                }
                if (S[i].equals("AC")) {
                    setAC2.add(p[i]);
                }
            }

            System.out.println(setAC.size() + " " + countWA);
        }
    }
}