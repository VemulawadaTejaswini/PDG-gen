import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long[] a = new long[n];
        long min = Long.MAX_VALUE;
        long min2 = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            long temp = Long.parseLong(sc.next());
            a[i] = temp;
            min = Math.min(min, Math.abs(temp - (i + 1)));
            min2 = Math.min(min, temp - (i + 1));
            max = Math.max(max, Math.abs(temp - (i + 1)));
        }
        long tmpMin = 0;
        long tmpMin2 = 0;
        long tmpMax = 0;
        for (int i = 0; i < n; i++) {
            tmpMin += Math.abs(a[i] - (min + i + 1));
            tmpMin2 += Math.abs(a[i] - (min2 + i + 1));
            tmpMax += Math.abs(a[i] - (max + i + 1));
        }
        System.out.println(Math.min(Math.min(tmpMin, tmpMin2), tmpMax));
    }
}