import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();
        int N = S.length;

        int[] a = new int[2];
        for (int i = 0; i < N; i++) {
            char ch = S[i];
            switch (ch) {
                case 'N':
                    a[0]++;
                    break;
                case 'S':
                    a[0]--;
                    break;
                case 'W':
                    a[1]++;
                    break;
                case 'E':
                    a[1]--;
                    break;
            }
        }
        
        if (a[0] == 0 && a[1] == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("Yes");
        }

        return;
    }

}