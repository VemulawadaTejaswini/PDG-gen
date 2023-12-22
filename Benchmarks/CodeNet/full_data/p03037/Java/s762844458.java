import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), M = sc.nextInt();
        int[] cards = new int[N];

        for (int i=0; i<M; i++) {
            int L = sc.nextInt();
            int R = sc.nextInt();

            for (int j=L-1; j<R; j++) {
                cards[j] += 1;
            }
        }
        int count = 0;
        for (int i=0; i<N; i++) {
            if (cards[i] == M) {
                count++;
            }
        }
        System.out.println(count);
    }
}