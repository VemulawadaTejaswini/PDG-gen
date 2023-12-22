import java.util.*;
public class Main {
    public static class Pair{
        int coor;
        long h;
        public Pair(int x,int y) {
            this.coor=x;
            this.h=y;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int a = sc.nextInt();
        Pair[] pairs=new Pair[n];
        for (int i = 0; i < n; i++) {
            int x=sc.nextInt();
            int y=sc.nextInt();
            pairs[i]=new Pair(x,y);
        }
        long res=0;
        Arrays.sort(pairs,(b,c)->  (b.coor-c.coor));
        int[] diff=new int[n+1];
       for(int i=0;i<n;i++)
        {
            int j=bs(pairs,i,d);
            long need=Math.max((pairs[i].h+a-1-diff[i]*a)/a,0);
            res+=need;
            diff[i]+=need;
            diff[j]-=need;
            diff[i+1]+=diff[i];
        }
        System.out.println(res);
    }
    public static int bs(Pair[] pairs, int start, int d)
    {
        int end=pairs.length;
        int left=0;
        while(left<end){
            int mid=left+(end-left)/2;
            if(pairs[mid].coor-pairs[start].coor<=2*d)
            {
                left=mid+1;
            }
            else
            {
                end=mid;
            }
        }
        return left;
    }
}