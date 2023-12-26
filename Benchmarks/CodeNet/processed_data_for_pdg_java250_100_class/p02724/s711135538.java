public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long ans = 0;
        ans += ((long) n / 500) * 1000;
        n %= 500;
        ans += (n / 5) * 5;
        System.out.println(ans);
    }
}
