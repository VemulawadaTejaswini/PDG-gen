public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int a = stdin.nextInt(); 
        int b = stdin.nextInt(); 
        int c = stdin.nextInt(); 
        int x = stdin.nextInt();
        int ans = 0;
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                for (int k = 0; k <= c; k++) {
                    if (i * 500 + j * 100 + k * 50 == x) ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
