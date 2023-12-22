import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int D = sc.nextInt();
        int N = sc.nextInt();

        int answer = 0;
        if (D == 0) { answer = N; }
        else if (D == 1) { answer = 100 * N; }
        else if (D == 2) { answer = 10000 * N; }
        if (N == 100) { answer += 1; }

        System.out.println(answer);
    }
}
