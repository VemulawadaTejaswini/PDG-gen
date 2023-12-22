import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] P = new int[3];
        P[0] = sc.nextInt();
        int min = P[0];
        int max = P[0];
        int ans = 0;

        for(int i=1; i<3; i++){
            P[i] = sc.nextInt();
            int m = min;
            min = Math.min(max, P[i]);
            max = Math.max(m, P[i]);
            ans += min;
        }
        System.out.println(ans);
    }
}