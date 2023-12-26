public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        boolean[] sunuke = new boolean[n];
        for (int i = 0; i < k; i++) {
            int jmax = sc.nextInt();
            for (int j = 0; j < jmax; j++) {
                sunuke[sc.nextInt() - 1] = true;
            }
        }
        int ans = 0;
        for (boolean isTrue : sunuke) {
            if (isTrue)
                ans++;
        }
        System.out.println(n - ans);
        sc.close();
    }
}
