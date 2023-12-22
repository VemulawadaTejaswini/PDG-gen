import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int ret = 0;
        Map<Integer,Integer> S = new HashMap<>();
        for (int i = 0; i < M; i++) {
            int s = sc.nextInt();
            int c = sc.nextInt();
            if ((s==1&&c==0) || (S.get(s) != null && S.get(s) == c)) {
                ret = -1;
                break;
            }
            S.put(s, c);
        }
        if (ret != -1) {
            for (int i = 1; i <= 9; i++) {
                int t = S.get(i) != null ? S.get(i) : 0;
                System.out.print(t);
            }
            System.out.println();
        } else {
            System.out.println(ret);
        }
    }
}