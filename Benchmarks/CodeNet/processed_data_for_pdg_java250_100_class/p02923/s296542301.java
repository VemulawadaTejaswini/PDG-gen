public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bef = 0;
        int ans = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            if (bef >= tmp) {
                ans++;
                if (ans > max) max = ans;
            } else {
                ans = 0;
            }
            bef = tmp;
        }
        System.out.println(max);
    }
}
