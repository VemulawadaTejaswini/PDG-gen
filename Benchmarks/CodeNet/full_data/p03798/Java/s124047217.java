import java.util.Scanner;

public class Main
{
    private static boolean solve(String s, Boolean[] xs)
    {
        char[] report = s.toCharArray();
        for (int i = 0; i < report.length; i++) {
            int src;
            if (i == 0) {
                src = 1;
            }
            else {
                src = i - 1;
            }

            int dst;
            if (i == 0) {
                dst = report.length - 1;
            }
            else {
                dst = i + 1;
            }

            boolean type = xs[i];
            if (type) {
                // Sheep
                if (report[i] == 'o') {
                    if (i == report.length - 1) {
                        return xs[src] == xs[0];
                    }
                    xs[dst] = xs[src];
                }
                else {
                    if (i == report.length - 1) {
                        return xs[src] != xs[0];
                    }
                    xs[dst] = !xs[src];
                }
            }
            else {
                // Wolf
                if (report[i] == 'o') {
                    if (i == report.length - 1) {
                        return xs[src] != xs[0];
                    }
                    xs[dst] = !xs[src];
                }
                else {
                    if (i == report.length - 1) {
                        return xs[src] == xs[0];
                    }
                    xs[dst] = xs[src];
                }
            }
        }

        throw new IllegalStateException("Shouldn't reach here");
    }

    private static String convResult(Boolean[] xs)
    {
        StringBuilder sb = new StringBuilder(xs.length);
        for (boolean b : xs) {
            if (b) {
                sb.append('S');
            }
            else {
                sb.append('W');
            }
        }
        return sb.toString();
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();

        {
            Boolean[] xs = new Boolean[n];
            xs[0] = true;
            xs[1] = true;
            if (solve(s, xs)) {
                System.out.println(convResult(xs));
                return;
            }
        }

        {
            Boolean[] xs = new Boolean[n];
            xs[0] = true;
            xs[1] = false;
            if (solve(s, xs)) {
                System.out.println(convResult(xs));
                return;
            }
        }

        {
            Boolean[] xs = new Boolean[n];
            xs[0] = false;
            xs[1] = true;
            if (solve(s, xs)) {
                System.out.println(convResult(xs));
                return;
            }
        }

        {
            Boolean[] xs = new Boolean[n];
            xs[0] = false;
            xs[1] = false;
            if (solve(s, xs)) {
                System.out.println(convResult(xs));
                return;
            }
        }

        System.out.println("-1");
    }
}

