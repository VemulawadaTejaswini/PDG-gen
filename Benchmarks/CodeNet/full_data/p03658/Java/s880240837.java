import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] l = new int[51];

        for (int i=0; i<n; i++) {
            l[sc.nextInt()]++;
        }

        int ans = 0;
        int remaining = k;
        for (int i=50; i>0; i--) {
            if (l[i] >= remaining) {
                ans += i*remaining;
                remaining = 0;
            } else {
                ans += i*l[i];
                remaining -= l[i];
            }
            if (remaining == 0) {break;} 
        }
        System.out.println(ans);
    }
}
