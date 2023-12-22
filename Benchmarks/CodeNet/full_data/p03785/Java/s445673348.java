import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), c = sc.nextInt(), k = sc.nextInt();
        int[] T = new int[n];
        for(int i = 0; i < n; i++) T[i] = Integer.parseInt(sc.next());
        Arrays.sort(T);

        int res = 1;
        int min = T[0];
        int cnt = 1;
        for(int i = 1; i < n; i++) {
            cnt++;
            if(cnt > c || T[i] - min > k) {
                cnt = 1;
                res++;
                min = T[i];
            }
        }
        System.out.println(res);
    }
}