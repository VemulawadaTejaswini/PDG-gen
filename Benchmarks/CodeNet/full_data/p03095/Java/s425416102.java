import java.util.Arrays;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(), count = 0;
        int[] counts = new int[26];
        for (char c : scanner.next().toCharArray())
            if (counts[c - 'a']++ == 0)
                count++;
        Arrays.sort(counts);

        long ans = ((1 << count) - 1) % 1000000007, com = 0;
        for (int i = 0; i < 26; i++) {
            if (counts[25 - i] <= 1)
                break;
            long t1 = (1 << count - 1 - i) % 1000000007;
            long t2 = (com / 2 + t1) % 1000000007 * (counts[25 - i] - 1) % 1000000007;
            ans = (ans + t2) % 1000000007;
            com = (com + t2 + t1) % 1000000007;
        }

        System.out.println(ans);
    }
}