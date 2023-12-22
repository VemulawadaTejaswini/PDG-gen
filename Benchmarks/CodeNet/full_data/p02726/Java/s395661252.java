import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        int ans[] = new int[n];
        for(int i=1;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                ans[dist(n,i,j,x,y)]++;
            }
        }
        for(int i=1;i<n;i++) System.out.println(ans[i]);
    }
    public static int dist(int n,int i,int j,int x,int y){
        int ans = j-i;
        int ans2 = Math.abs(x-i)+Math.abs(y-j)+1;
        int ans3 = Math.abs(x-j)+Math.abs(y-i)+1;
        return Math.min(Math.min(ans2, ans3), ans);
    }
}