public class Main {
    static final int MOD = 1_000_000_007; 
    static final int INF = 1_000_000_000; 
    static final int MAX = 10_000_000;
    static long[] fact = new long[100];
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        h *= 30;
        m*=6;
        double rad = h-m;
        rad+=(double)m/12;
        if(rad>180)rad -=360;
        if(rad<0)rad*=-1;
        rad = rad*Math.PI/180;
        double ans = a*a +b*b - 2*a*b*Math.cos(rad);
        System.out.println(Math.sqrt(ans));
    }
}
