import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] l = new int[100001];
        for(int i = 0;i < N;i++)    l[sc.nextInt()]++;
        int ans = 0;
        ans = l[0]+l[1];
        for(int i = 1;i < 100000;i++)   ans = Math.max(ans, l[i-1]+l[i]+l[i+1]);
        ans = Math.max(ans, l[99999]+l[100000]);
        System.out.println(ans);
    }
}