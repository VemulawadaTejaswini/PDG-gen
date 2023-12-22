import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] aArr = new int[n];

        for (int i = 0; i < n; i++) {
            aArr[i] = sc.nextInt();
        }

        Arrays.sort(aArr);

        int ans = 0;
        for (int i = 0; i < aArr.length; i++) {
            if (x >= aArr[i]) {
                x -= aArr[i];
                ans++;
            } else {
                break;
            }
        }

        System.out.println(ans);
    }
}
