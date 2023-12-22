import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N+1];
        for(int i=1;i<=N;i++) a[i] = sc.nextInt();
        long n = (long) N;
        long total = (n*(n+1))/2;
        long tar = total/2+1;
        long cnt=0;
        Arrays.sort(a);
        for(int i=1;i<=N;i++){
            long cnt1 = Math.min(i,N+1-i);
            long cnt2 = Math.min(i-1,N+1-i);
            cnt+=cnt1+cnt2;
            if(cnt>=tar){
                System.out.println(a[i]);
                System.exit(0);
            }
        }
    }
}
