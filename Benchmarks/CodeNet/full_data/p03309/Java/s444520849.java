import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int[] l = new int[N];
        for(int i = 0;i < N;i++)    l[i] = sc.nextInt()-i-1;
        Arrays.sort(l);
        int b = l[N/2+N%2-1];
        int ans = 0;
        for(int i = 0;i < N;i++)    ans += Math.abs(l[i]-b);
        System.out.println(ans);
    }
}