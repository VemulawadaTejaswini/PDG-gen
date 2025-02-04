public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        long n = Long.parseLong(sc.next());
        long k = Long.parseLong(sc.next());
        long b = n / k;
        List<Long> digits = new ArrayList<>();
        if (b > 0) digits.add(n % k);
        while (b >= k) {
            b /= k;
            digits.add(b % k);
        }
        out.println(digits.size() + 1);
        out.flush();
    }
}
