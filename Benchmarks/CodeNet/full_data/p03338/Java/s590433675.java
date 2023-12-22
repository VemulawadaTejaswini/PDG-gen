import java.util.*;

public class Main {

    private int N;
    private String S;
    private int[][] ch;

    public Main() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = sc.next();
        ch = new int[26][2];
    }

    public void inputCH() {
        boolean[] first = new boolean[26];
        for (int i = 0; i < N; i++) {
            if (!first[S.charAt(i) - 'a']) {
                ch[S.charAt(i) - 'a'][0] = i;
                first[S.charAt(i) - 'a'] = true;
            } else {
                ch[S.charAt(i) - 'a'][1] = i;
            }
        }
    }

    public void printAnswer() {
        int max = 0;
        for (int i = 1; i < N-1; i++) {
            int count = 0;
            for (int j = 0; j < 26; j++) {
                if (ch[j][0] < i && ch[j][1] >= i) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
            }
        }
        System.out.println(max);
    }

    public void run() {
        inputCH();
        printAnswer();
    }

    public static void main(String[] args) {
        (new Main()).run();
    }

}
