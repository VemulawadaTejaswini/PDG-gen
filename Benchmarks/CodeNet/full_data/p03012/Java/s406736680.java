import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] w = new int[n+1];
        for(int i = 1;i<=n;i++){
            w[i] += Integer.parseInt(sc.next());
        }
        int tmp = w[n] / 2;
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for(int i = 1;i<=n;i++){
            if(min > Math.abs(w[i] - tmp)){
                ans = i;
                min = Math.abs(w[i] - tmp);
            }
        }
        System.out.println(min*2);
    }
}