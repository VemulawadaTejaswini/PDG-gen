public class Main {
    public static void main(final String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        boolean niceTap = true;
        for (int i = 0; i < S.length(); i++) {
            char tap = S.charAt(i);
            if (i % 2 == 1) {
                if (tap == 'R') niceTap = false;
            } else {
                if (tap == 'L') niceTap = false;
            }
        }
        System.out.println(niceTap ? "Yes" : "No");
    }
}
