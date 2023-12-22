import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        long W =sc.nextLong();
        long a=Math.min(patern1(H,W),patern2(H,W));
        long b=Math.min(a,patern1(W,H));
        long ans=Math.min(b,patern2(W,H));
        System.out.println(ans);
    }
    long patern1(long h,long w){
        long ans=Long.MAX_VALUE;
        for(int i=1;i<h;i++){
            long tmp=Math.max(i*w,(h-i)/2*w);
            long tnp=Math.max(tmp,((h-i)-(h-i)/2)*w);
            long tlp=Math.min(i*w,(h-i)/2*w);
            long top=Math.min(tlp,((h-i)-(h-i)/2)*w);
            ans=Math.min(ans,tnp-top);
        }
        return ans;
    }
    long patern2(long h,long w){
        long ans=Long.MAX_VALUE;
        for(int i=0;i<h;i++){
            long tmp=Math.max(i*w,(h-i)*(w/2));
            long tnp=Math.max(tmp,(h-i)*(w-w/2));
            long tlp=Math.min(i*w,(h-i)*(w/2));
            long top=Math.min(tlp,(h-i)*(w-w/2));
            ans=Math.min(ans,tnp-top);
        }
        return ans; 
    }
}