import java.util.*;
public class Main {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int count = 0;
        for (int i = 0; i < n; i++) {
            int k = i;
            for (int j = i+1; j < n; j++) {
                while (k < n && a[k] < a[i] + a[j]) k++;
                count += k - (j+1);
            }
        }
        System.out.println(count);
    }
}