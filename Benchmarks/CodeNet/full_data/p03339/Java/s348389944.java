public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        String s = scanner.next();
        int temp = (int)s.chars().filter(c -> c == 'E').count() - (s.charAt(0) == 'E' ? 1 : 0), ans = temp;
        for (int i = 1; i < n; i++)
            ans = Math.min(ans, temp += (s.charAt(i - 1) == 'E' ? 0 : 1) - (s.charAt(i) == 'E' ? 1 : 0));
        System.out.println(ans);
    }
}