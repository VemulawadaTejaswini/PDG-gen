import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] a = new int[N];
        for(int i=0;i<N;i++) a[i]=sc.nextInt();
        int[] dist = new int[N];
        for(int i=0;i<N;i++) dist[i]=Math.abs(X-a[i]);
        Arrays.sort(dist);
        int ans = dist[0];
        for(int i=1;i<N;i++){
            ans = gcd(ans,dist[i]);
        }
        System.out.println(ans);
    }
    static int gcd(int a, int b){ // a<b
        int t=0;
        while(b!=0){
            t=a;
            a=b;
            b=t%b;
        }
        return a;
    }
}

