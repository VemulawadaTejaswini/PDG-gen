public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int k = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= k; i++) {
            ans += (k - i + 1) / 2;
            System.out.println(ans);
        }
        System.out.println(ans);
    }
}
