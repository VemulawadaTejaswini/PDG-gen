public class Main {
    public static void main(final String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        String text = sc.next();
        String leftHalfStr = text.substring(0, text.length() / 2 );
        String rightHalfStr = text.substring(text.length() / 2 , text.length());
        System.out.println(leftHalfStr.equals(rightHalfStr) ? "Yes" : "No");
    }
}
