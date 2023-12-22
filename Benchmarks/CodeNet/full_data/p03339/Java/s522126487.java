import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == 'W') {
                    a[i]++;
                }
            }
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(j) == 'E') {
                    a[i]++;
                }
            }
        }
        Arrays.sort(a);
        System.out.println(a[0]);
    }

}