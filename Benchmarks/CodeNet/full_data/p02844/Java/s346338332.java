import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();
        int cnt = 0;
        int[] SInts = new int[S.length()];

        for (int i = 0; i < N; i++) {
            SInts[i] = Character.getNumericValue(S.charAt(i));
        }

        for (int i = 0; i < 1000; i++) {
            int[] PIN = {i / 100, (i / 10) % 10, i % 10};
            int matchesCnt = 0;
            for (int j = 0; j < N; j++) {
                if (SInts[j] == PIN[matchesCnt]) {
                    matchesCnt++;
                }
                if (matchesCnt == 3) {
                    cnt++;
                    break;
                }
            }
        }

        System.out.println(cnt);
    }


}