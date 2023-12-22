import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int tap = 1;
        int ans = 0;
        while (tap < B){
            tap += (A-1);
            ans++;
        }
        System.out.println(ans);
    }
}