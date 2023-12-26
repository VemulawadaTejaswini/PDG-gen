public class Main {
    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        final String S = sc.next();
        int cnt = 0;
        for (int i = 0; i < S.length(); i++) {
            cnt += S.charAt(i) == '1' ? 1 : 0;
        }
        System.out.println(cnt);
    }
}
