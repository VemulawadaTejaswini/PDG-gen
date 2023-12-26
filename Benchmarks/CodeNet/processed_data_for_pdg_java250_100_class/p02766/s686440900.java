public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int out = 0;
        while (n >= k) {
            n /= k;
            out++;
        }
        out += 1;
        System.out.println(out);
    }
}
