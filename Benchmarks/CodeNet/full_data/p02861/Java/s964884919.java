import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[][] ary = new int[n][2];
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            ary[i][0] = Integer.parseInt(sc.next());
            ary[i][1] = Integer.parseInt(sc.next());
            sb.append(i);
        }
        permute(list, sb.toString(), 0, n - 1);
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            for (int j = 0; j < n - 1; j++) {
                int a = Integer.parseInt(String.valueOf(s.charAt(j)));
                int b = Integer.parseInt(String.valueOf(s.charAt(j + 1)));
                sum += Math.sqrt(Math.pow(ary[a][0] - ary[b][0], 2) + Math.pow(ary[a][1] - ary[b][1], 2));
            }
        }
        System.out.println(sum / factorial(n));
    }

    private static void permute(List<String> list, String str, int l, int r) {
        if (l == r) {
            list.add(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(list, str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    private static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    private static long factorial(long n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}