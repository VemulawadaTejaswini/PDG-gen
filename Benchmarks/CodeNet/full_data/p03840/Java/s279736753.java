import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long[] a = new long[7];
        for(int i=0;i<7;i++) a[i]=sc.nextLong();
        long ans = 0;
        ans += a[1];
        long res1 = (a[0]/2+a[3]/2+a[4]/2)*2;
        long temp = Math.min(Math.min(a[0],a[3]),a[4]);
        long res2 = temp*3+((a[0]-temp)/2+(a[3]-temp)/2+(a[4]-temp)/2)*2;
        ans += Math.max(res1,res2);
        System.out.println(ans);
    }
}
