public class Main {
    public static void main(final String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int A = sc.nextInt();
        System.out.println((A - 1) % (B - 1) != 0 ? (A - 1) / (B - 1) + 1 : (A - 1) / (B - 1));
    }
}
