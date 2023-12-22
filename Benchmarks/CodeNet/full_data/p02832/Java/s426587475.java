import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[] array = new int[n];
 
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int ans = 0;
        int num = 1;

        for (int i = 0; i < n; i++) {
            if (array[i] == num) {
                num++;
            } else {
                ans++;
            }
        }

        if (num == 1) {
            ans = -1;
        }

        System.out.println(ans);
    }
}
