import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] a = new int[4];
        a[0] = Character.getNumericValue(s.charAt(0));
        a[1] = Character.getNumericValue(s.charAt(1));
        a[2] = Character.getNumericValue(s.charAt(2));
        a[3] = Character.getNumericValue(s.charAt(3));
        String[] op = new String[3];
        dfs(a, op, 0);
        System.out.println(a[0] + op[0] + a[1] + op[1] + a[2] + op[2] + a[3] + "=7");
    }

    private static boolean dfs(int[] a, String[] op, int n) {
        int sum = 0;
        if (n == 3) {
            sum = sumsub(op[0], a[0], a[1]);
            sum = sumsub(op[1], sum, a[2]);
            sum = sumsub(op[2], sum, a[3]);
            return sum == 7;
        }
        op[n] = "+";
        if (dfs(a, op,n + 1)) {
            return true;
        }
        op[n] = "-";
        if (dfs(a, op,n + 1)) {
            return true;
        }
        return false;
    }

    private static int sumsub(String op, int a, int b) {
        if ("+".equals(op)) {
            return a + b;
        } else {
            return a - b;
        }
    }
}