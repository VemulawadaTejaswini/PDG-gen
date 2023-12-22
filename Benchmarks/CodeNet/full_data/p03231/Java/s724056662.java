
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int m = sc.nextInt();
        sc.nextLine();
        String first = sc.nextLine();
        String second = sc.nextLine();
        if (first.charAt(0) != second.charAt(0)) {
            System.out.println(-1);
            return;
        }
        final int lcm = lcm(n, m);


        final int result;
        if (n < m) {
            result = check(first, second, lcm);
        } else {
            result = check(second, first, lcm);
        }
        System.out.println(result);
    }

    private static int check(String a, String b, int lcm) {
        final int al = lcm / a.length();
        final int bl = lcm / b.length();
        for (int i = 0; i < a.length(); i++) {
            final char c1 = a.charAt(i);
            final int i1 = al * i;
            if (i1 % bl == 0 && b.charAt(i1 / bl) != c1) {
                return -1;
            }
        }
        return lcm;
    }

    private static int gcd(int a, int b) {
        return a % b == 0 ? b : gcd(b, a % b);
    }

    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
