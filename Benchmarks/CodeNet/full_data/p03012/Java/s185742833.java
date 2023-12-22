import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for(int i = 1; i<n; i++) {
            int a1 = 0;
            int b1 = 0;
            for(int j = 0; j<n; j++) {
                if(j<i) a1 += a[j];
                else b1 += a[j];
            }
            min = Math.min(min, Math.abs(a1-b1));
        }

        System.out.println(min);


    }
}