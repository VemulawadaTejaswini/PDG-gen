import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    private int count(char[] m1, char[] m2) {
        int cnt = 0;
        for (int i = 0; i < m1.length; i++) {
            if (m1[i] > 0 && m2[i] > 0) {
                cnt++;
            }
        }
        return cnt;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] S = sc.next().toCharArray();

        char[] map1 = new char[26];
        char[] map2 = new char[26];
        for (int i = 0; i < N; i++) {
            map1[S[i] - 'a']++;
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            map1[S[i] - 'a']--;
            map2[S[i] - 'a']++;
            max = Math.max(count(map1, map2), max);
        }

        System.out.println(max);
        return;
    }

}