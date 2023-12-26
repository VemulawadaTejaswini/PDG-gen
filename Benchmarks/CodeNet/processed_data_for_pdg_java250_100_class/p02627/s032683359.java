public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final String s1 = sc.next();
        sc.close();
        String result = "a";
        if (Character.isUpperCase(s1.charAt(0))) {
            result = "A";
        }
        System.out.println(result);
    }
}
