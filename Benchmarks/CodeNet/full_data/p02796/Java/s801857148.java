import java.util.*;

class Main {
    // 
    static final long MOD = 1_000_000_007;
    static final int MAX = 2000000000;
    static final int INF = 100000000;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x,l; 
        arm[] a = new arm[n];
        for(int i = 0;i < n;i++){
            x = sc.nextInt();
            l = sc.nextInt();
            a[i] = new arm(x,l);
        }
        Arrays.sort(a,(s,t)->Integer.compare(s.x,t.x));
        int high = -MAX;
        int low = MAX;
        int ans = 0;
        for(int i = 0;i < n;i++){
            if(a[i].min >= high){
                high = a[i].max;
                ans++;
            }
        }
        System.out.println(ans);
    }
}

class arm{
    int x;
    int l;
    int min;
    int max;
    arm(int x,int l){
        this.x = x;
        this.l = l;
        this.min = x-l;
        this.max = x+l;
    }
}
  