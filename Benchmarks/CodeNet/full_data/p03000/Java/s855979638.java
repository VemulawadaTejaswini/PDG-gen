import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int l = Integer.parseInt(sc.next());
        int[] x = new int[n+1];
        x[0] = 0;
        for(int i = 1;i<n+1;i++){
            x[i] = x[i-1] + Integer.parseInt(sc.next());
        }
        int ans = 0;
        for(int i = 0;i<n+1;i++){
            if(x[i] > l){
                ans = i;
                break;
            }
            if(i == n){
                ans = i + 1;
            }
        }
        System.out.println(ans);
    }
}