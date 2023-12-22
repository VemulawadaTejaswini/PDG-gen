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
        if(b%a==0) return a;
        int up = (int) Math.sqrt(a)+1;
        for(int i=up;i>=1;i--){
            if(a%i==0){
                if(b%i==0) return i;
            }
        }
        return 1;
    }
}

