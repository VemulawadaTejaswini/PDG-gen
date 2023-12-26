public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        long A = Long.parseLong(sc.next());
        long B = Long.parseLong(sc.next());
        long C = A + B;
        long L = N % C;
        long target = A * (N / C) + Math.min(L, A);
        System.out.println(target);
    }
}
