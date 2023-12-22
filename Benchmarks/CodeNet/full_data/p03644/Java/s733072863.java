import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i;
        for (i = 1; i <= N; i *= 2);
        System.out.println(i / 2);
    }
}
