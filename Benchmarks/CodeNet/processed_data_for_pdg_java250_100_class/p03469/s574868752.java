public class Main {
    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        final String S = sc.next();
        StringBuffer sb = new StringBuffer(S);
        sb.setCharAt(3, '8');
        System.out.println(sb.toString());
    }
}
