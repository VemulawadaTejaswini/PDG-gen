public class Main {
    public static void main(final String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        String text = sc.next();
        StringBuffer sb = new StringBuffer(text);
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            sb.setCharAt(i, ch + N > 'Z' ? (char) (ch + N - ('Z' - 'A') - 1) : (char) (ch + N));
        }
        System.out.println(sb.toString());
    }
}
