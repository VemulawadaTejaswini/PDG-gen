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
        int K = sc.nextInt();

        int[] x = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
        }   

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += 2 * Math.min(x[i], K - x[i]);
        }   

        System.out.println(sum);

        return;
    }   

}