public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 0;
        int q = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            p += x * Math.pow(10, n - i -1);
        }
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            q += x * Math.pow(10, n - i -1);
        }
        List<Integer> a = new ArrayList<>();
        dfs(a, n, 1, 0, 0);
        Collections.sort(a);
        int b = 0;
        int c = 0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) == p) b = i;
            if(a.get(i) == q) c = i;
        }
        System.out.println(Math.abs(b-c));
        sc.close();

    }

    private static void dfs(List<Integer> a, int n, int x, int sum, int bit) {
        for (int i = 0; i < n; i++) {
            if((bit >> i & 1) == 1)continue;
            int y = sum + x * (int)Math.pow(10, n - i -1);
            if(x == n) a.add(y);
            else {
                bit |= 1 << i;
                dfs(a, n, x+1, y, bit);
                bit ^= 1 << i;
            }
        }
    }

}
