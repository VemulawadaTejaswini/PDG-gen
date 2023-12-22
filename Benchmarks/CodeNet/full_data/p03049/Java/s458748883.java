import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            String[] s = new String[N];
            for (int i = 0; i < N; i++) {
                s[i] = in.next();
            }

            int count = 0;
            for (int i = 0; i < N; i++) {
                count += countAC(s[i]);
            }

            int countBA = 0;
            int countB = 0;
            int countA = 0;
            for (int i = 0; i < N; i++) {
                if (s[i].charAt(0) == 'B' && s[i].charAt(s[i].length() - 1) == 'A') {
                    countBA++;
                } else if (s[i].charAt(0) == 'B') {
                    countB++;
                } else if (s[i].charAt(s[i].length() - 1) == 'A') {
                    countA++;
                }
            }

            if (countBA - 1 >= 0) {
                count += countBA - 1;
                countBA = 1;
                if (countA > 0) {
                    count++;
                    countA--;
                }
                if (countB > 0) {
                    count++;
                    countB--;
                }
            }
            count += Math.min(countA, countB);

            System.out.println(count);
        }
    }

    private static int countAC(String s) {
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == 'A' && s.charAt(i) == 'B') {
                count++;
            }
        }
        return count;
    }
}
