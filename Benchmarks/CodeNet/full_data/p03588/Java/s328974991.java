import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int Amax = 0;
        int ans = 0;
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int Acandidate = sc.nextInt();
            int Bcandidate = sc.nextInt();
            if (Acandidate > Amax) {
                Amax = Acandidate;
                ans = Acandidate + Bcandidate;
            }
        }
        System.out.println(ans);
    }
}