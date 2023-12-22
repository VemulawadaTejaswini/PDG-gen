import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[5];//marchを数える。
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.charAt(0) == 'M') a[0]++;
            if (s.charAt(0) == 'A') a[1]++;
            if (s.charAt(0) == 'R') a[2]++;
            if (s.charAt(0) == 'C') a[3]++;
            if (s.charAt(0) == 'H') a[4]++;
        }
        long sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = i+1; j < 4; j++) {
                for (int k = j+1; k < 5 ; k++) {
                    long tmp = a[i] * a[j];
                    sum += tmp * a[k];
                }

            }
        }
        System.out.println(sum);
    }
}
