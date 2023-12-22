import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        int n  = a.length;

        int ans = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 'a'; i <= 'z'; i++) {
            count = getCount(a, i);
//            System.out.println((char) i + " count: " + count);
            ans = Math.min(ans, count);
        }
        System.out.println(ans);
    }

    static int getCount(char[] a, int i) {
        int maxSpan = 0;
        int lastJ = -1;

        for (int j = 0; j < a.length; j++) {
            if (a[j] == i) {
                maxSpan = Math.max(maxSpan, j - lastJ - 1);
//                System.out.println("j: " + j + ", maxSpan: " + maxSpan + "");
                lastJ = j;
            }
        }

        return Math.max(maxSpan, a.length - lastJ - 1);
    }
}
