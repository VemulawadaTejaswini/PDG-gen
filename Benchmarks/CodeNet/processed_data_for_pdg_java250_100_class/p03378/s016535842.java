class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;
    Main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < M; i++) {
            int num = sc.nextInt();
            a[i] = num;
        }
        int l = 0;
        int r = 0;
        for(int i=0;i<M;i++){
            if(a[i]<X)l++;
            else r++;
        }
                System.out.println(Math.min(l,r));
    }
    public static void main(String[] args) {
        new Main();
    }
}
