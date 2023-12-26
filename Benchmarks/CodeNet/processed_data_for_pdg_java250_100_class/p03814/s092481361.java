class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;
    Main() {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        String S = sc.next();
        System.out.println(S.substring(S.indexOf('A'), S.lastIndexOf('Z')+1).length());
    }
    public static void main(String[] args) {
        new Main();
    }
}
