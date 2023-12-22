import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // SOLUTION A
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int answer = solutionA(n, a, b);
//        System.out.println(answer);
//    }
//
//    public static int solutionA (int n, int a, int b) {
//        if ((n * a) < b) {
//            return (n * a);
//        } else {
//            return b;
//        }
//    }

        // SOLUTION B
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        System.out.println(solutionB(i, j));
    }

    // james wuz here lul
    public static int solutionB(int l, int r) {
        if (l + 2019 < r) {
            return 0;
        } else {
            int min = 2019;
            for (int i = l; i <= r; i++) {
                for (int j = i + 1; j <= r; j++) {
                    int x = (i * j) % 2019;
                    if (x < min) {
                        min = x;
                    }
                }
            }
            return min;
        }
    }
}
