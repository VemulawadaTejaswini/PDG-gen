import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int need = N, n2 = 0;
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            if (a % 4 == 0) {
                need -= 3;
            } else if (a % 2 == 0) {
                need--;
                n2++;
            }
        }
        if (need > 0 || need == 0 && n2 == 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
