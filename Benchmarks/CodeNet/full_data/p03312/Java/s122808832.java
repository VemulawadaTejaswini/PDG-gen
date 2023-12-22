import java.util.Scanner;

public class Main {
    static int[] num;
    static long[] pre;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        num = new int[n];
        pre = new long[n];
        long tot = sc.nextInt();
        pre[0] = num[0] = (int)tot;
        for(int i=1;i<n;++i) {
            tot += num[i] = sc.nextInt();
            pre[i] = pre[i-1]+num[i];
        }
        int lo = 0;
        int hi = n-1;
        long best = tot/2;
        int ans = -1;
        long sol = (long)1e18;
      for(int mid = 1;mid<n-2;++mid){
                //case 1
                int m1 = div(0,mid);
                int m2 = div(mid+1,n-1);
                long diff1 = Math.max(Math.max(pre[m1],pre[mid]-pre[m1]),Math.max(pre[m2]-pre[mid],pre[n-1]-pre[m2]))
                        - Math.min(Math.min(pre[m1],pre[mid]-pre[m1]),Math.min(pre[m2]-pre[mid],pre[n-1]-pre[m2]));
                //case 2
                int x1 = div(0,mid+1);
                int x2 = div(mid+2,n-1);
                long diff2 = Math.max(Math.max(pre[x1],pre[mid+1]-pre[x1]),Math.max(pre[x2]-pre[mid+1],pre[n-1]-pre[x2]))
                        -  Math.min(Math.min(pre[x1],pre[mid+1]-pre[x1]),Math.min(pre[x2]-pre[mid+1],pre[n-1]-pre[x2]));
                sol = Math.min(sol,Math.min(diff1,diff2));


        }
        System.out.println(sol );
    }
    static int div(int start,int end){
        int lo = start;
        int hi = end;
        long rem = (start>0?pre[start - 1]:0);
        long best = (pre[end] - rem)/2;
        int ans = start;
        long d = (long)1e18;
        while(lo <= hi){
            int mid = (lo + hi)/2;
            if(best - (pre[mid]-rem) > 0){
                ans = mid;
                lo = mid + 1;
            }
            else
                hi = mid - 1;
        }
        //System.out.println(ans);
        if(ans == pre.length-1)
            return ans;
        if(Math.abs(pre[ans] - rem -
                (pre[end] - pre[ans]))< Math.abs(pre[ans+1] - rem - (pre[end] - pre[ans+1])))
            return ans;
        else
            return ans + 1;
    }
}
