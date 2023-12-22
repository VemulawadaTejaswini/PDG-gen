import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] d = new int[110];

        for (int i=0; i<N; i++) {
            d[i] = sc.nextInt();
        }

        int[] num = new int[110];

        for (int i=0; i<N; i++) {
            num[d[i]]++;
        }

        int res = 0;
        for (int n : num) {
            res += n > 0 ? 1 : 0;
        }

        System.out.println(res);
    }
}

