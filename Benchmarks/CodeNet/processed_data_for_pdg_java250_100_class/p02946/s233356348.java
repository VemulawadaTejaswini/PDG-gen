public class Main {
    public static void main(final String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int X = sc.nextInt();
        StringJoiner sj = new StringJoiner(" ");
        for (int i = -(K - 1); i < K; i++) {
            sj.add(String.valueOf(i + X));
        }
        System.out.println(sj.toString());
    }
}
