import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int res = 0;

        if (N < 10) {
            res = N;
        } else if (10 <= N && N < 100) {
            res = 9;
        } else if (100 <= N && N < 1000) {
            res = N - 99 + 9;
        } else if (1000 <= N && N < 10000) {
            res = 900 + 9;
        } else if (10000 <= N && N < 100000) {
            res = N - 9999 + 900 + 9;
        } else if (N == 100000) {
            res = 90909;
        }
        System.out.println(res);
        return;
    }
}

