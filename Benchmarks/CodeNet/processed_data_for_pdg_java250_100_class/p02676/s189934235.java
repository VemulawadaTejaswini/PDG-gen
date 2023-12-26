public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int k = sc.nextInt();
        final String s = sc.next();
        sc.close();
        String result = s;
        if (s.length() > k) {
            result = result.substring(0, k) + "...";
        }
        System.out.println(result);
    }
}
