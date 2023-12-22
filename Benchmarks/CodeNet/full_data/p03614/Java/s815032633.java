import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, b;
        String res = "";
        int ans = 0;
        for (int i=0; i<n; i+=2) {
            a = sc.nextInt();
            if (i<n-1) {
                b = sc.nextInt();
            } else {
                b = -1; 
            }
            if (a == i+1 || b == i+2) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}