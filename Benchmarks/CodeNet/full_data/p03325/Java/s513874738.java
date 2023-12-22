import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int cnt = 0;
        while (true) {
            int min = Integer.MAX_VALUE;
            int wrongCnt = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] % 2 != 0) {
                    wrongCnt++;
                }
                min = Math.min(min, array[i]);
            }
            if (wrongCnt == n) break;
            for (int i = 0; i < n; i++) {
                if (array[i] % 2 != 0 || array[i] == min) {
                    array[i] *= 3;
                } else {
                    array[i] /= 2;
                }
            }
            
            cnt++;
        }
        System.out.println(cnt);
    }
}
