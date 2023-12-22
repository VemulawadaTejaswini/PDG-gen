import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ans = new int[100001];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            ans[a]++;
            if(a != 100000) ans[a+1]++;
            if(a != 0) ans[a-1]++;
            else ans[100000]++;
        }
        Arrays.sort(ans);

        System.out.println(ans[100000]);
        sc.close();
    }

}
