public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int ans = 0;
        double nearestGap = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            double value = t - (sc.nextInt() * 0.006);
            double gap = Math.abs(value - a);
            if (gap < nearestGap) {
                nearestGap = gap;
                ans = i;
            }
        }
        System.out.println(++ans);
    }
}
