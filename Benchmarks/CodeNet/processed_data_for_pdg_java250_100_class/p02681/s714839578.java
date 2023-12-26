public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final String s = sc.next();
        final String t = sc.next();
        sc.close();
        String result = "No";
        if (t.length() == s.length() + 1 && t.substring(0, s.length()).equals(s)) {
            result = "Yes";
        }
        System.out.println(result);
    }
}
