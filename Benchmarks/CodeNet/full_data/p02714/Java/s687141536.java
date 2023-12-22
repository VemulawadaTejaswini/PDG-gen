import java.util.*;

public class Main {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int[] a = new int[n];
        int rCount = 0;
        int gCount = 0;
        int bCount = 0;
        for (int i = 0; i < n; i++) {
            if(s.charAt(i) == 'R') {
                a[i] = 0;
                rCount++;
            }
            if(s.charAt(i) == 'G') {
                a[i] = 1;
                gCount++;
            }
            if(s.charAt(i) == 'B') {
                a[i] = 2;
                bCount++;
            }
        }

        Long res = (long) rCount * gCount * bCount;

        for (int i = 0; i < n; i++) {
            for(int j = i +1; j < n; j++) {
                int k = j + (j - i);

                if (k < n) {
                    if(a[i] == a[j] || a[i] == a[k] || a[j] == a[k]) {
                        continue;
                    }

                    res--;
                }
            }
        }

        System.out.println(res);
    }
}
