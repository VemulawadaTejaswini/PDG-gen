class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        String ans = "";
        for (int index = 0; index < s.length; index++) {
            switch (s[index]) {
            case '0':
                ans += "0";
                break;
            case '1':
                ans += "1";
                break;
            case 'B':
                ans = ans.substring(0, Math.max(0,ans.length() - 1));
                break;
            }
        }
        System.out.println(ans);
    }
}
