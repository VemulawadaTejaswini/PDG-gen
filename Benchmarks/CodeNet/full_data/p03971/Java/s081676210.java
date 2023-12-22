import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        char[] S = sc.next().toCharArray();

        int ranked = 0;
        int ranked2 = 0;
        for (int i = 0; i < N; i++) {
            int rank = i + 1;
            boolean ok = false;

            if (S[i] == 'a') {
                if (ranked < A + B) {
                    ok = true;
                }
            } else if (S[i] == 'b') {
                if (ranked < A + B && ranked2 < B) {
                    ok = true;
                    ranked2++;
                }
            }

            if (ok) { 
                ranked++;
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        return;
    }

}