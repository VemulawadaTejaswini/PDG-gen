public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        boolean flg = false;
        long l = b + c;
        long answer = b * (a / l);
        long n = a % l;
        System.out.println(answer + Math.min(n, b));
    }
}
