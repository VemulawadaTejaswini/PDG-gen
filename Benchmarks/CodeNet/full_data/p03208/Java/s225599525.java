import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] h = new int[n];
        for(int i=0;i<n;i++)
        {
            h[i] = scan.nextInt();
        }
        Arrays.sort(h);
        int ans = MinInterval(h,k-1);
        System.out.println(ans);
    }
    
    static int MinInterval(int[] h,int k){
        int smallnum = 1000000010;
        for(int i=0;i+k<h.length;i++)
        {
            smallnum = Math.min(smallnum,h[i+k]-h[i]);
        }
        return smallnum;
    }
}